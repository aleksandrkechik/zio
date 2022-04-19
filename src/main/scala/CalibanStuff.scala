import caliban.GraphQL.graphQL
import caliban.RootResolver

object CalibanStuff {
  case class Character(name: String, age: Int)


  def getCharacters: List[Character] = {
    println(characterList)
    characterList
  }
  def getCharacter(name: String): Option[Character] = characterList.find(_.name.equals(name))
  val characterList: List[Character] = List(Character("John", 20), Character("Jane", 20))

  // schema
  case class CharacterName(name: String)
  case class Queries(characters: List[Character],
                     character: CharacterName => Option[Character])
  // resolver
  val queries = Queries(getCharacters, args => getCharacter(args.name))
  val api = graphQL(RootResolver(queries))
}