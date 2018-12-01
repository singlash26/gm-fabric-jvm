# Overview
This document describes how to implement a `custom` `twitter.ExceptionMapper.

## Provided ExceptionMappers
Currently there are two ExceptionMappers provided:

- com.deciphernow.server.rest.FailFastExceptionMapper
- com.deciphernow.server.rest.IndividualRequestTimeoutException

## Registering new ExceptionMappers

You need to implement something along the lines of below:

```scala
class CustomExceptionMapperModule extends TwitterModule {
  override def singletonStartup(injector: Injector): Unit = {
    val manager = injector.instance[ExceptionManager]
    manager.add[MyNewExceptionMapper]
    manager.add[DifferentExceptionMapper]
  }
}
```

* Note that by implementing above you will be replacing the default provided `ExceptionMappers`. You will have to explicitly add them back in.


Then pass this new Module as a Sequenct to the `RestServer`:

```scala
  def rest = Some(new RestServer(
    Nil,
    Seq(new WombatSkittlesRestController(wombatSkittlesManager)),
    Seq(new CustomExceptionMapperModule)
  ))
```