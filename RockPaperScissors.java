import javax.swing.JOptionPane;


public class RockPaperScissors {

    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, "The first player who reaches 5 points wins", "LET'S START", JOptionPane.PLAIN_MESSAGE);

        int user_score, pc_score;
        user_score = 0;
        pc_score = 0;
        int round = 0;
        while (user_score < 5 && pc_score < 5) {
            round += 1;
            String inputValue = JOptionPane.showInputDialog(null, "Your Score = " + user_score + " - " + "Pc Score = " + pc_score + "\nRock,Scissors or Paper?", "Round" + round, JOptionPane.PLAIN_MESSAGE);
            /*
            pcValue = 1 ==> rock
            pcValue = 2 ==> paper
            pcValue = 3 ==> Scissors
            * */
            int pcValue = (int) (Math.random() * (3 - 1 + 1)) + 1;
            if (inputValue.equalsIgnoreCase("rock") || inputValue.equalsIgnoreCase("r"))
            {
                switch (pcValue)
                {
                    case 1: //==> rock
                    {
                        JOptionPane.showMessageDialog(null, "IT'S A TIE!", "Message", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                    case 2: //==> paper
                    {
                        pc_score++;
                        JOptionPane.showMessageDialog(null, "YOU LOST!", "Rock Paper Scissors", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                    case 3: //==> Scissors
                    {
                        user_score++;
                        JOptionPane.showMessageDialog(null, "YOU WON!", "Rock Paper Scissors", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                }
            }
            else if (inputValue.equalsIgnoreCase("scissors") || inputValue.equalsIgnoreCase("s"))
            {
                switch (pcValue)
                {
                    case 1: //==> rock
                    {
                        pc_score++;
                        JOptionPane.showMessageDialog(null, "YOU LOST!", "Rock Paper Scissors", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                    case 2: //==> paper
                    {
                        user_score++;
                        JOptionPane.showMessageDialog(null, "YOU WON!", "Rock Paper Scissors", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                    case 3: //==> Scissors
                    {
                        JOptionPane.showMessageDialog(null, "IT'S A TIE!", "Message", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                }
            }
            else if (inputValue.equalsIgnoreCase("paper") || inputValue.equalsIgnoreCase("p"))
            {
                switch (pcValue)
                {
                    case 1: //==> rock
                    {
                        user_score++;
                        JOptionPane.showMessageDialog(null, "YOU WON!", "Rock Paper Scissors", JOptionPane.PLAIN_MESSAGE);

                        break;
                    }
                    case 2: //==> paper
                    {
                        JOptionPane.showMessageDialog(null, "IT'S A TIE!", "Message", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                    case 3: //==> Scissors
                    {
                        pc_score++;
                        JOptionPane.showMessageDialog(null, "YOU LOST!", "Rock Paper Scissors", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                }
            }
        }
        if(user_score == 5)
            JOptionPane.showMessageDialog(null, "CONGRATS! YOU WON THIS GAME!", "Message", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "I'M SORRY! YOU LOST THIS GAME!", "Message", JOptionPane.PLAIN_MESSAGE);

    }
}
