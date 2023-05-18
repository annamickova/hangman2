public class Display{

    public String start(){
        return """
                hello
                welcome in hangman
                enter number 3-8""";
    }


    public String picture(int attempts){
        String pic = "aaa";
        switch (attempts) {
            case 9 -> {
                pic = " ";
                return pic;
            }
            case 8 -> {
                pic = """
                 
                 
                 
                 
                 
                 
                    
                          
                --------------""";
                return pic;
            }
            case 7 -> {
                pic = """
                 
                 
                 
                 
                 
                 
                    ______
                   /      \\ 
                --------------""";
                return pic;
            }
            case 6 -> {
                pic = """
                       
                       |/
                       |
                       |
                       |
                    ______
                   /      \\
                --------------""";
                return pic;
            }
            case 5 -> {
                pic = """
                       --------
                       |/
                       |
                       |
                       |
                    ______
                   /      \\
                --------------""";
                return pic;
            }
            case 4 -> {
                pic = """
                       --------
                       |/     |
                       |
                       |
                       |
                    ______
                   /      \\ 
                --------------""";
                return pic;
            }
            case 3 -> {
                pic = """
                       --------
                       |/     |
                       |      O
                       |
                       |
                    ______
                   /      \\ 
                --------------""";
                return pic;
            }
            case 2 -> {
                pic = """
                       --------
                       |/     |
                       |      O 
                       |      |  
                       |      
                    ______
                   /      \\ 
                --------------""";
                return pic;
            }
            case 1 -> {
                pic = """
                       --------
                       |/     |
                       |    \\O /
                       |      |
                       |       
                    ______
                   /      \\ 
                --------------""";
                return pic;
            }
            case 0 -> {
                pic = """
                       --------
                       |/     |
                       |    \\O /
                       |      | 
                       |     / \\
                    ______
                   /      \\ 
                --------------""";
                return pic;
            }

        }
        return pic;
    }
}
