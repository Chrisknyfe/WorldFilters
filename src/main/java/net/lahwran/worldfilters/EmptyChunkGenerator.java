/**
 * 
 */
package net.lahwran.worldfilters;

import java.util.Random;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

/**
 * @author lahwran
 *
 */
public class EmptyChunkGenerator extends ChunkGenerator {
    public byte[] generate(World world, Random random, int chunkx, int chunky) {
        return new byte[32768];
    }
}
