package discord.server.brn.app.bot;

public class BOT
{
    private BOT() {}

    /*
    INIT
     */

    private static BOT Instance;
    public static BOT getBot()
    {
        if (Instance == null)
        {
            Instance = new BOT();
        }

        return Instance;
    }

    /*
    Build Bot
     */

    // Vars


}
