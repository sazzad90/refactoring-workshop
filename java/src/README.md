# Code_Smell-1
  #Fizzbuzz
  Solved Smell name                                                                    line no
1. comments                                                           
2. switch statements(unnecessary nested if-else loop)                                    7-13
3. inappropriate naming(say wasn't a meaning full name)                                   4
  
  #PlaintextToHtmlConverter
  Solved Smell name                                                                     line no
1. comments                                                       
2. switch statements(switch case is replaced by if-else)                                 61-65
3. Long method(checkCondition is used to extract basicHtmlEncode method)                   34
4. temporary field(i is made method var instead of class var)                              27

  #TriviaGame
  Solved Smell name                                                                      line no
1. primitive obsession(int arrays are replaced with arraylist)                             8-10
2. odd ball(unnecessary function was there to do same functionality)                        25
3. logical duplication(howManyPlayers() was removed as it just called players.size)     30,35,36,37
4. long method(method is extracted)                                                         99
5. duplicate code(method is extracted)                                                      61
6. inappropriate naming(add function is replaced with addPlayerDetails)                     32
7. dead code(wrongAnswer method)                                                            127