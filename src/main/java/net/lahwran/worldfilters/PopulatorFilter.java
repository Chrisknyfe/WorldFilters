/**
 * 
 */
package net.lahwran.worldfilters;

import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;

/**
 * @author lahwran
 *
 */
public abstract class PopulatorFilter extends BlockPopulator {

    @Override
    public final void populate(World world, Random random, Chunk chunk) {
        PopulatedChunk popchunk = new PopulatedChunk(chunk);
        
    }

    
}
