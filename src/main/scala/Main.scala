
import CalibanStuff.api
import zio._

import java.io.IOException

//object Main extends ZIOAppDefault {
//
//  val app: ZIO[Has[Console], IOException, Unit] = for {
//    fiber1 <- longRunningJob.fork
//    fiber2 <- anotherLongRunningJob.fork
//    _ <- Console.printLine("Execution of two job started")
//    result <- (fiber1 <*> fiber2).join
//  } yield result
//
//  def longRunningJob: ZIO[Has[Console], IOException, Unit] = {
//    Console.printLine("I'm job one!")
////    Console.printLine(CalibanStuff.api.render)
//  }
//
//  def anotherLongRunningJob: ZIO[Has[Console], IOException, Unit] = {
//    val query = """
//  {
//    characters {
//      name
//    }
//  }"""
//    for {
//      interpreter <- CalibanStuff.api.interpreter
//      result      <- interpreter.execute(query)
//      _           <- Console.printLine(result.data.toString)
//    } yield ()
//    Console.printLine("I'm job two!")
//  }
//  def run = app
//}


object TempCaliban extends ZIOAppDefault {
  val query = """
  {
    characters {
      name
    }
  }"""



  override def run: ZIO[zio.ZEnv with Has[ZIOAppArgs], Any, Any] = {
    for {
      interpreter <- CalibanStuff.api.interpreter
      result      <- interpreter.execute(query)
    } yield (Console.printLine(result.data.toString))
//    Console.printLine(api.render)
  }
}

