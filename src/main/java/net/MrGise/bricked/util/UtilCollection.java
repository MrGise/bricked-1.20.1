package net.MrGise.bricked.util;

public class UtilCollection {
    private final TranslationKeyUtil transKeyUtil;
    private final ResourceLocationUtil resLocUtil;
    private final ItemUtil itemUtil;

    public UtilCollection(String modid) {
        this.transKeyUtil = new TranslationKeyUtil(modid);
        this.resLocUtil = new ResourceLocationUtil(modid);
        this.itemUtil = new ItemUtil(modid);
    }

    public ItemUtil item() {
        return this.itemUtil;
    }

    public ResourceLocationUtil resource() {
        return this.resLocUtil;
    }
    public ResourceLocationUtil.Affix affix() {
        return this.resLocUtil.affix();
    }

    public TranslationKeyUtil key() {
        return this.transKeyUtil;
    }

}
