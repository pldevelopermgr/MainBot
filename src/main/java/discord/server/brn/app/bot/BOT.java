package discord.server.brn.app.bot;

import net.dv8tion.jda.api.JDABuilder;

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

    private JDABuilder builder;

}
