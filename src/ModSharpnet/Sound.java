package ModSharpnet;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class Sound
    {
        @ForgeSubscribe
        public void onSound(SoundLoadEvent event)
        {
            try
                {
                    /*
                    String[] soundFiles = { "Record 1.wav", "Record 2.wav", "Record 3.wav", "Record 4.wav", "Record 5.wav", "Record 6.wav", "Record 7.wav", "Record 8.wav", "Record 9.wav", "Record 10.wav", "Record 11.wav", "Record 12.wav", "Record 13.wav", "Record 14.wav", "Record 15.wav", "Record 16.wav" };
                    
                    for (int i = 0; i < soundFiles.length; i++)
                    {
                        
                    }
                    */
                    event.manager.addStreaming("modsharpnet:cd1.ogg");
                    event.manager.addStreaming("modsharpnet:cd2.ogg");
                    /*
                    event.manager.addStreaming("modsharpnet:cd3.wav");
                    event.manager.addStreaming("modsharpnet:cd4.wav");
                    event.manager.addStreaming("modsharpnet:cd5.wav");
                    event.manager.addStreaming("modsharpnet:cd6.wav");
                    event.manager.addStreaming("modsharpnet:cd7.wav");
                    event.manager.addStreaming("modsharpnet:cd8.wav");
                    event.manager.addStreaming("modsharpnet:cd9.wav");
                    event.manager.addStreaming("modsharpnet:cd10.wav");
                    event.manager.addStreaming("modsharpnet:cd11.wav");
                    event.manager.addStreaming("modsharpnet:cd12.wav");
                    event.manager.addStreaming("modsharpnet:cd13.wav");
                    event.manager.addStreaming("modsharpnet:cd14.wav");
                    event.manager.addStreaming("modsharpnet:cd15.wav");
                    event.manager.addStreaming("modsharpnet:cd16.wav");
                    */
                }
            catch (Exception e)
            {
                System.err.println("SharpnetMod: Failed to register one or more sounds.");
            }
        }
    }
