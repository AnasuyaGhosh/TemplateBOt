import java.lang.Math;
import java.util.Scanner;
public class Main {

    //CREATE INSTANCE VARIABLES HERE. Ensure they are static.
    //May want to create an array of goodbye answers.
   
        public static void main(String[] args) {
                Scanner in = new Scanner (System.in);//Creates scanner object.
                Scanner in2 = new Scanner (System.in);//Creates a second scanner object.

                Movie[] horror = {new Movie("The Conjuring", "Paranormal investigators Ed and Lorraine Warren work to help a family terrorized by a dark presence in their farmhouse.", "R", 2013),
                                  new Movie("Jigsaw", "Police search for a killer who force his victim to play sadistic games of life and death.", "R", 2017),
                                  new Movie("The Black Phone", "After being abducted and locked in a basement, a boy starts receiving calls on a disconnected phone from the killer's  previous victims.", "R", 2021)};
                Movie[] action = {new Movie("John Wick", "John Wick, a former hitman is forced to return to action and seek revenge after his home is broken into and robbed, and his dog killed.", "R", 2014),
                                  new Movie("Interstellar", "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, are tasked with finding a new planet for humans.", "PG-13", 2014),
                                  new Movie("The Hunger Games", "Katniss Everdeen is forced to participate in the Hunger Games: a televised competition in which two teenagers from each of the twelve Districts of Panem are chosen at random to fight to the death.", "PG-13", 2012)};
                Movie[] comedy = {new Movie("ted", "John Bennett, a man whose childhood wish of bringing his teddy bear to life came true, now must decide between keeping the relationship with the bear, Ted or his girlfriend, Lori.", "R", 2012), 
                                  new Movie("Shrek", "A mean lord exiles fairytale creatures to the swamp of a grumpy ogre, who must go on a quest and rescue a princess for the lord in order to get his land back.", "PG", 2001), 
                                  new Movie("Friday", "It's Friday, and Craig and Smokey must come up with $200 they owe a local bully or there won't be a Saturday.", "R", 1995)};
                Movie[] romance = {new Movie("La La Land", "When Sebastian, a pianist, and Mia, an actress, follow their passion and achieve success in their respective fields, they find themselves torn between their love for each other and their careers.", "PG-13", 2016),
                                    new Movie("Love Actually", "Love Actually follows the lives of eight very different couples in dealing with their love lives in various loosely interrelated tales all set during a frantic month before Christmas in London, England.", "R", 2003),
                                    new Movie("The Fault in Our Stars", "Two teenagers, Hazel and Gus, meet at a cancer support group and fall in love.", "PG-13", 2014)};
                String[] hehes = {"Tell me a movie that you watched recently and liked", "What are your hobbies", "What's your favorite color", "What's your favorite TV show", ""};


                System.out.println("\n");
                System.out.println("Hi! I'm PopcornPal, a chatbot that helps you easily choose a movie!");          
                System.out.println("[Once you've found a movie you like, press q to quit]");          
                int movnum = 0;
                String input =  "";
                String tempinp = "";
                int val =  0;



                outerloop:
                while(true) {

                    System.out.println("Let's choose a new movie! Tell me what genre you like. Here are a few suggestions: Horror, Action, Comedy, Romance");
                    input = in.nextLine().toLowerCase();
                    System.out.println("\n");
                    val = (int) (Math.random() * 3);
                    System.out.println(hehes[val]);
                    tempinp = in.nextLine().toLowerCase();
                    System.out.println("\n");
                    
                    


                    if (input.contains("horror")) {
                        movnum = (int)(Math.random()*3);
                        System.out.println("Here's a horror movie you might enjoy: " + horror[movnum].getName());
                        while (true) {
                            System.out.println("Reply with 'details' if you want more details, 'different' to get a different suggestion or 'q' to quit");
                            input = in.nextLine().toLowerCase();
                            System.out.println("");
                            
                            if (input.contains("different")) {
                                System.out.println("\n");
                                break;
                            } else if (input.contains("details")) {
                                System.out.println("Name: " + horror[movnum].getName());
                                System.out.println("Year released : " + horror[movnum].getYear());
                                System.out.println("Age rating: " + horror[movnum].getAge());
                                System.out.println("Summary: " + horror[movnum].getBlurb() + "\n");
                                break;
                            } else if (input.equals("q")) {
                                break outerloop;
                        
                            } else {
                                System.out.println("Sorry, I don't know what that means. Try again.\n");
                            }    
                        }

                    } else if (input.contains("action")) {
                        movnum = (int)(Math.random()*3);
                        System.out.println("Here's a action movie you might enjoy: " + action[movnum].getName());
                        while (true) {
                            System.out.println("Reply with 'details' if you want more details, 'different' to get a different suggestion or 'q' to quit");
                            input = in.nextLine().toLowerCase();
                            System.out.println("");
                            
                            if (input.contains("different")) {
                                System.out.println("\n");
                                break;
                            } else if (input.contains("details")) {
                                System.out.println("Name: " + action[movnum].getName());
                                System.out.println("Year released : " + action[movnum].getYear());
                                System.out.println("Age rating: " + action[movnum].getAge());
                                System.out.println("Summary: " + action[movnum].getBlurb() + "\n");
                                break;
                            } else if (input.equals("q")) {
                                break outerloop;
                        
                            } else {
                                System.out.println("Sorry, I don't know what that means. Try again.\n");
                            }    
                        }

                    } else if (input.contains("comedy")) {
                        movnum = (int)(Math.random()*3);
                        System.out.println("Here's a comedy movie you might enjoy: " + comedy[movnum].getName());
                        while (true) {
                            System.out.println("Reply with 'details' if you want more details, 'different' to get a different suggestion or 'q' to quit");
                            input = in.nextLine().toLowerCase();
                            System.out.println("");
                            
                            if (input.contains("different")) {
                                System.out.println("\n");
                                break;
                            } else if (input.contains("details")) {
                                System.out.println("Name: " + comedy[movnum].getName());
                                System.out.println("Year released : " + comedy[movnum].getYear());
                                System.out.println("Age rating: " + comedy[movnum].getAge());
                                System.out.println("Summary: " + comedy[movnum].getBlurb() + "\n");
                                break;
                            } else if (input.equals("q")) {
                                break outerloop;
                        
                            } else {
                                System.out.println("Sorry, I don't know what that means. Try again.\n");
                            }    
                        }

                    } else if (input.contains("romance")) {
                        movnum = (int)(Math.random()*3);
                        System.out.println("Here's a romance movie you might enjoy: " + romance[movnum].getName());
                        while (true) {
                            System.out.println("Reply with 'details' if you want more details, 'different' to get a different suggestion or 'q' to quit");
                            input = in.nextLine().toLowerCase();
                            System.out.println("");
                            
                            if (input.contains("different")) {
                                System.out.println("\n");
                                break;
                            } else if (input.contains("details")) {
                                System.out.println("Name: " + romance[movnum].getName());
                                System.out.println("Year released : " + romance[movnum].getYear());
                                System.out.println("Age rating: " + romance[movnum].getAge());
                                System.out.println("Summary: " + romance[movnum].getBlurb() + "\n");
                                break;
                            } else if (input.equals("q")) {
                                break outerloop;
                        
                            } else {
                                System.out.println("Sorry, I don't know what that means. Try again.\n");
                            }    
                        }
                    } else if (input.equals("q")) {
                        break outerloop;
                    } else {
                        System.out.println("Sorry I haven't heard of that one. Try again.");
                    }
                    
                
                
                }                
        
                System.out.println("Bye! It was fun talking to you!");
        }
    }