
import pureconfig._
import pureconfig.generic.ProductHint
import scala.concurrent.duration._
  
  case class LocalSearchParameters(
    balance: Double = 0.5,
    threshold: Double = 0.01)
  
  case class TerminationCriteria(
    targetValue: Double = Double.MinValue, 
    maxEvaluations: Long = Long.MaxValue, 
    maxTime: Duration = Duration.Inf) 
    
  case class ExperimentParameters(
    name: String, 
    description: Option[String], 
    parallelism: String = "Sequential", 
    repetitions: Int = 1, 
    populationSize: Int, 
    localSearch: LocalSearchParameters,   
    evaluationFunction: String,
    terminationCriteria: TerminationCriteria) 

case class Configuration(
    experiments: List[ExperimentParameters]
    )     
object Configuration { // pureconfig implicits
    // format conversion from config keys to class field names
    implicit def hint[T] = ProductHint[T](ConfigFieldMapping(CamelCase, SnakeCase))   // v2.12    
}