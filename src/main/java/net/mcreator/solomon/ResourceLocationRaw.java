/**
 * This mod element is always locked. Enter your code in the methods below.
 * If you don't need some of these methods, you can remove them as they
 * are overrides of the base class ElementsSolomonMod.ModElement.
 *
 * You can register new events in this class too.
 *
 * As this class is loaded into mod element list, it NEEDS to extend
 * ModElement class. If you remove this extend statement or remove the
 * constructor, the compilation will fail.
 *
 * If you want to make a plain independent class, create it in
 * "Workspace" -> "Source" menu.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
*/
package net.mcreator.solomon;

import net.minecraft.util.ResourceLocation;

/**
 * Created by Furia on 2016/11/17.
 */
public class ResourceLocationRaw extends ResourceLocation {
    protected final String resourcePathRaw;

    public ResourceLocationRaw(String resourceDomainIn, String resourcePathIn) {
        super(resourceDomainIn, resourcePathIn);

        resourcePathRaw = resourcePathIn;
    }
    public ResourceLocationRaw(String[] resourceName) {
        this(resourceName[0],resourceName[1]);
    }
    public ResourceLocationRaw(String resourceName) {
        this(splitObjectName(resourceName));
    }

    @Override
    public String getResourcePath() {
        return resourcePathRaw;
    }

    @Override
    public String toString()
    {
        return this.resourceDomain + ':' + this.resourcePath;
    }
}


