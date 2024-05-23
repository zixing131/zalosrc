package com.zing.zalo.zinstant.zom.adapter;

import com.zing.zalo.adapter.AbstractC6922b;
import com.zing.zalo.exception.ZarcelDuplicateException;
import com.zing.zalo.zinstant.zom.node.ZOMAudio;
import com.zing.zalo.zinstant.zom.node.ZOMAudio__Zarcel;
import com.zing.zalo.zinstant.zom.node.ZOMButton;
import com.zing.zalo.zinstant.zom.node.ZOMButton__Zarcel;
import com.zing.zalo.zinstant.zom.node.ZOMContainer;
import com.zing.zalo.zinstant.zom.node.ZOMContainer__Zarcel;
import com.zing.zalo.zinstant.zom.node.ZOMImage;
import com.zing.zalo.zinstant.zom.node.ZOMImage__Zarcel;
import com.zing.zalo.zinstant.zom.node.ZOMInput;
import com.zing.zalo.zinstant.zom.node.ZOMInput__Zarcel;
import com.zing.zalo.zinstant.zom.node.ZOMSkeleton;
import com.zing.zalo.zinstant.zom.node.ZOMSkeleton__Zarcel;
import com.zing.zalo.zinstant.zom.node.ZOMSlider;
import com.zing.zalo.zinstant.zom.node.ZOMSlider__Zarcel;
import com.zing.zalo.zinstant.zom.node.ZOMText;
import com.zing.zalo.zinstant.zom.node.ZOMText__Zarcel;
import com.zing.zalo.zinstant.zom.node.ZOMVideo;
import com.zing.zalo.zinstant.zom.node.ZOMVideo__Zarcel;

/* loaded from: classes7.dex */
public class ZOMAdapter extends AbstractC6922b {
    @Override // com.zing.zalo.adapter.AbstractC6922b
    protected void onRegisterChildClasses() {
        try {
            registryAdd(0, ZOMText.class, ZOMText__Zarcel.class, new ZOMText.ZOMTextFactory());
            registryAdd(1, ZOMImage.class, ZOMImage__Zarcel.class, new ZOMImage.ZOMImageFactory());
            registryAdd(2, ZOMVideo.class, ZOMVideo__Zarcel.class, new ZOMVideo.ZOMVideoFactory());
            registryAdd(3, ZOMButton.class, ZOMButton__Zarcel.class, new ZOMButton.ZOMButtonFactory());
            registryAdd(4, ZOMContainer.class, ZOMContainer__Zarcel.class, new ZOMContainer.ZOMContainerFactory());
            registryAdd(5, ZOMSlider.class, ZOMSlider__Zarcel.class, new ZOMSlider.ZOMSliderFactory());
            registryAdd(7, ZOMSkeleton.class, ZOMSkeleton__Zarcel.class, new ZOMSkeleton.ZOMSkeletonFactory());
            registryAdd(8, ZOMInput.class, ZOMInput__Zarcel.class, new ZOMInput.ZOMInputFactory());
            registryAdd(9, ZOMAudio.class, ZOMAudio__Zarcel.class, new ZOMAudio.ZOMAudioFactory());
        } catch (ZarcelDuplicateException e11) {
            e11.printStackTrace();
        }
    }
}
