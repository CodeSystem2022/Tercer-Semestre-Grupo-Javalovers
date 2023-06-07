¿Que es Docker?
Docker es una plataforma de código abierto que permite a los desarrolladores y administradores de sistemas construir, empaquetar y 
distribuir aplicaciones de forma eficiente. Docker utiliza la virtualización a nivel de sistema operativo, también conocida como 
"contenedores", para crear entornos de ejecución aislados para aplicaciones. Estos contenedores pueden ser más ligeros y más rápidos de 
crear y eliminar que las máquinas virtuales tradicionales.

Vamos a empezar viendo primero que diferencias hay entre las máquinas virtuales y los contenedores de Docker, para ver porque son mejores los contenedores.

Virtual Machines Vs Containers
Virtual Machines
Es un sistema operativo completo, funcionando de manera aislada sobre otro sistema operativo completo. La tecnología de VMs permite compartir el hardware de modo que lo puedan utilizar varios sistemas operativos al mismo tiempo.

Obviamente, por debajo siempre tiene que haber algún tipo de hardware que lo sustente todo. Lo que se suele llamar coloquialmente como "hierro" y de forma ms marketiniana se suele llamar "infraestructura". Todo ese poder no vale mucho si no le añadimos el "cerebro" en forma de sistema operativo.

Para que las máquinas virtuales puedan ejecutarse es necesario instalar otro componente por encima del Sistema Operativo: el hipervisor. Un hipervisor es un software especializado en exponer los recursos de hardware que están debajo del sistema operativo, de modo que puedan ser utilizados por otros sistemas operativos. Esto incluye las CPUs (o cores), la memoria y el espacio de almacenamiento adems del resto del hardware. Estas VMs "engañan" a un sistema operativo convencional para que crea que se está ejecutando sobre una máquina física. Los hipervisores vienen con productos como Hyper-V (incluido gratuitamente con Windows), VirtualBox o VMWare entre otros.

NOTA Adicional: existen hipervisores de tipo 1 que se instalan directamente sobre el hardware y evitan la necesidad de instalar a mayores un sistema operativo convencional en el medio. De hecho, estos son los que se suelen utilizar en los Data Center para aumentar todavía más el rendimiento.



Gracias a esto podemos tener distintos sistemas operativos ejectutándose en paralelo sobre la misma máquina física, cada uno con su memoria y espacio en discos reservados (los "cores" se pueden compartir), y completamente aislados unos de otros. Gracias al avance de los hipervisores en los últimos años, y a las tecnologías orientadas a la virtualización que ofrecen los procesadores modernos, la pérdida de rendimiento es mínima y es una manera muy eficiente de compartir el hardware para sacarle más partido.

Containers
La filosofa de contenedores es totalmente diferente a la de las VMs. Si bien tratan también de aislar a las aplicaciones y de generar un entorno replicable y estable para que funcionen, en lugar de albergar un sistema operativo completo lo que hacen es compartir los recursos del propio ssitema operativo "host" sobre el que se ejecutan.

Docker Engine (hay otros tipos de soluciones para contenedores como Virtuozzo, LXC/LXD, OpenVZ, DC/OS...) se encarga de lanzar y gestionar los contenedores con nuestras aplicaciones, pero en lugar de exponer los diferentes recursos de hardware de la máquina de manera discreta (es decir, 1 procesador y "x" GB de RAM... para cada aplicación), lo que hace es compartirlos entre todos los contenedores optimizando su uso y eliminando la necesidad de tener sistemas operativos separados para conseguir el aislamiento.



Docker funciona a partir de imágenes que se pueden reutilizar entre varias aplicaciones (fíjate en el esquema anterior, en que las aplicaciones 2 y 3 comparten el runtime). Cada una de esas imágenes se puede asimilar a una "capa" que se puede superponer a otras para formar un sistema de archivos que es la combinación de todas ellas. Por ejemplo, una capa puede llevar las bibliotecas o runtime que necesitamos utilizar (como Node.js o PHP), otra con unas bibliotecas determinadas de las que hace uso neustra aplicación, y otra capa final con el cdigo de nuestra aplicación. La combinación resultante (una nueva imagen, única para nuestra app), es lo que forma la base de nuestro contenedor.

Cuando se lanzan uno o varios contenedores a partir de una imagen, a efectos de nuestra aplicación es como si estuviese ejecutándose en su propio sistema operativo, aislado de cualquier otra aplicación que hubiese en la máquina en ese momento. Pero la realidad es que están compartiendo el sistema operativo "host" que hay por debajo. Un contenedor ve su propio sisteama de archivos, el resultante de "superponer" las capas de las que se mencionaba antes, y los recursos hardware se van asignando dinámicamente en función de las necesidades, de lo cual se ocupa Docker Engine (o el equivalente si usamos otro tipo de contenedores). Es decir, Docker asla aplicaciones, no sistemas operativos completos.

NOTA: también es posible que acceda al sistema de archivos de la máquina local para persistir de forma permanente información propia de la aplicación, ya que si un contenedor se cierra, todos los cambios hechos en sus sistema de archivos virtual se pierden. Aunque existen opciones para conseguirlo sin tener que hacer esto. Pero eso es lo máximo que se puede romper, ese aislamiento entre el contenedor y el sistema operativo huésped.

Docker vs Máquinas Virtuales
En primer lugar debemos tener en cuenta que, en el caso de los contenedores, el hecho de que no necesiten un sistema operativo completo sino que reutilicen el subyacente reduce mucho la carga que debe soportar la máquina física, el espacio de almacenamiento utilizado y el tiempo necesario para lanzar las aplicaciones. Un sistema operativo puede ocupar desde poco menos de 1GB para algunas distribuciones de Linux con lo mínimo necesario, hasta más de 10GB en el caso de un sistema Windows completo. Además, estos sistemas operativos, para funcionar requieren un mínimo de memoria RAM reservada, que puede ir desde 1 hasta varios GB, dependiendo de nuestras necesidades. Por lo tanto los contenedores son mucho más ligeros que las máquinas virtuales.

Cuando definimos una máquina virtual debemos indicar de antemano cuántos recursos físicos le debemos dedicar. Por ejemplo, podemos decir que nuestra VM va a necesitar 2 vCores (procesadores virtuales), 4GB de RAM y un espacio en disco de 100 GB. En el caso de los procesadores, es posible compartirlos entre varias máquinas virtuales (pero no conviene pasarse o irán fatal de rendimiento), y el espacio en disco se puede hacer que solo ocupe lo que de verdad se esté utilizando, de modo que crezca en función de las necesidades y no ocupe siempre tanto como habíamos reservado. Pero en el caso de la memoria y otros elementos (acceso a unidades externas o dispositivos USB) la reserva es total. Por eso, aunque nuestra aplicación no haga uso en realidad de los 4GB de RAM reservados da igual: no podrán ser utilizados por otras máquinas virtuales ni por nadie más. En el caso de los contenedores esto no es así. De hecho no indicamos qué recursos vamos a necesitar, sino que es Docker Engine, en función de las necesidades de cada momento, el encargado de asignar lo que sea necesario para que los contenedores funcionen adecuadamente.

Esto hace que los entornos de ejecución de Docker sean mucho más ligeros, y que se aproveche mucho mejor el hardware, además de permitir levantar muchos más contenedores que VMs en la misma máquina física. Mientras que una VM puede tardar un minuto o más en arrancar y tener disponible nuestra aplicación, un contenedor Docker se levanta y responde en unos pocos segundos (o menos, según la imagen). El espacio ocupado en disco es muy inferior con Docker al no necesitar que instalemos el sistema operativo completo.

Por otro lado, Docker no permite utilizar en un sistema operativo "host" contenedores/aplicaciones que no sean para ese mismo sistema operativo. Es decir, no podemos ejecutar un contenedor con una aplicación para Linux en Windows ni al revés. Lo cual puede suponer un impedimento en algunas ocasiones.

NOTA: Docker para Windows, paradójicamente, utiliza una máquina virtual Linux en segund plano para poder ejecutar aplicaciones Linux. Los contenedores Windows se ejecutan nativamente en Windows, claro.

Además para poder hacer despliegues avanzados de aplicaciones en contenedores hay que ir más allá de Docker y utilizar tecnologías como Kubernetes, que nos permiten orquestar y controlar los despliegues con mucha partes en movimiento. Estas tecnologías pueden llegar a ser complejas de aprender y dominar.

RESUMIENDO
Los contenedores permiten desplegar aplicaciones más rápido, arrancarlas y pararlas más rápido y aprovechar mejor los recursos de hardware. Las máquinas virtuales nos permiten crear sistemas completos totalmente aislados, con mayor control sobre el entorno y mezclando sistemas operativos host y huésped.

Cada tecnología tiene sus aplicaciones y sus ventajas según las necesidades y circunstancias de cada desarrollo. En la actualidad los contenedores en general y Docker en particular se están convirtiendo en una tecnología indispensable y cada vez se utilizan para más cosas, no solo para desplegar aplicaciones en producción, sino también para crear entornos de desarrollo replicables entre todos los miembros de un equipo, asegurar que las aplicaciones se van a ejecutar igual en todos los entornos (desarrollo, pruebas y producción), etc. Hay quien asegura que, a medio plazo, la mayoría de los desarrolladores usaremos Docker para desarrollar y desplegar aplicaciones.

FUENTE: https://www.campusmvp.es/recursos/post/que-diferencia-hay-entre-docker-contenedores-y-maquinas-virtuales.aspx
