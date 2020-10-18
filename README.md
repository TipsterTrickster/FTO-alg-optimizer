Run the program and then where it says “alg:” put the alg K solve gave you (with the wide moves and everything), this will give you the alg without wide moves, it will replace some moves like “F” with “FF”, and it’ll add zz to the end of it

You can take this alg and then copy it into the “2nd alg:” place and that will optimize it for the stuff you currently have uncommented.

So if you want to go straight to the 2nd alg area make sure you have it in this format (it basically made it easier for me to code to have it like this) F = FF, B=BB

If you want to do several algs at a time just separate them with “ zz “, if you do this with the first alg it will automatically add the zz’s where they need to be added so you can copy what you get straight into the 2nd alg area

Ok now on how to set what movesets you want to use, In the Main class at the bottom you’ll see 2 blocks of code one will basically check for the moveset that works best with the edge in front notation (ie FR, U, D, Rw) and the one on the bottom checks the moveset that works best with Ben’s notation (Ie BR, BRw, U, D). But you can change this, the “if (allalgs[j].contains("BB.") || allalgs[j].contains("FF") || allalgs[j].contains("FR") || allalgs[j].contains("BL"))” statement has all the moves that you want to filter out, so if there is a move listed here it will search for algs without that move, and basically an easy way to check multiple movesets is to first check something like (for bens notation) <BRw BR U D> then if nothing comes up you would want to maybe add BB to that list because it isn’t as good as the first 4, but is better than other options, so what you would to is add a “.” to the end of BB and that will no longer filter out that move. Also if for example you wanted to check for algs with FL instead of BRw you would comment out the for statement right below the comment that says “//uncomment this to check for BRws”


I probably missed something so let me know if you have any questions
