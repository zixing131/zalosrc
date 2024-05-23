package com.zing.zalo.zinstant.zom.adapter;

import com.zing.zalo.zinstant.zom.node.ZOM;
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
import p648xk.InterfaceC29690f;
import p648xk.InterfaceC29691g;

/* loaded from: classes7.dex */
public class ZOMArrayAdapter {
    public ZOM[] createFromSerialized(InterfaceC29690f interfaceC29690f) {
        int mo147644d = interfaceC29690f.mo147644d();
        ZOM[] zomArr = new ZOM[mo147644d];
        for (int i11 = 0; i11 < mo147644d; i11++) {
            int mo147644d2 = interfaceC29690f.mo147644d();
            switch (mo147644d2) {
                case 0:
                    ZOMText createObject = ZOMText.createObject();
                    ZOMText__Zarcel.createFromSerialized(createObject, interfaceC29690f);
                    zomArr[i11] = createObject;
                    break;
                case 1:
                    ZOMImage createObject2 = ZOMImage.createObject();
                    ZOMImage__Zarcel.createFromSerialized(createObject2, interfaceC29690f);
                    zomArr[i11] = createObject2;
                    break;
                case 2:
                    ZOMVideo createObject3 = ZOMVideo.createObject();
                    ZOMVideo__Zarcel.createFromSerialized(createObject3, interfaceC29690f);
                    zomArr[i11] = createObject3;
                    break;
                case 3:
                    ZOMButton createObject4 = ZOMButton.createObject();
                    ZOMButton__Zarcel.createFromSerialized(createObject4, interfaceC29690f);
                    zomArr[i11] = createObject4;
                    break;
                case 4:
                    ZOMContainer createObject5 = ZOMContainer.createObject();
                    ZOMContainer__Zarcel.createFromSerialized(createObject5, interfaceC29690f);
                    zomArr[i11] = createObject5;
                    break;
                case 5:
                    ZOMSlider createObject6 = ZOMSlider.createObject();
                    ZOMSlider__Zarcel.createFromSerialized(createObject6, interfaceC29690f);
                    zomArr[i11] = createObject6;
                    break;
                case 6:
                default:
                    throw new IllegalArgumentException("Unsupported ZOM type: " + mo147644d2);
                case 7:
                    ZOMSkeleton createObject7 = ZOMSkeleton.createObject();
                    ZOMSkeleton__Zarcel.createFromSerialized(createObject7, interfaceC29690f);
                    zomArr[i11] = createObject7;
                    break;
                case 8:
                    ZOMInput createObject8 = ZOMInput.createObject();
                    ZOMInput__Zarcel.createFromSerialized(createObject8, interfaceC29690f);
                    zomArr[i11] = createObject8;
                    break;
                case 9:
                    ZOMAudio createObject9 = ZOMAudio.createObject();
                    ZOMAudio__Zarcel.createFromSerialized(createObject9, interfaceC29690f);
                    zomArr[i11] = createObject9;
                    break;
            }
        }
        return zomArr;
    }

    public void serialize(ZOM[] zomArr, InterfaceC29691g interfaceC29691g) {
        interfaceC29691g.mo147652a(zomArr.length);
        for (ZOM zom : zomArr) {
            interfaceC29691g.mo147652a(zom.mType);
            switch (zom.mType) {
                case 0:
                    ZOMText__Zarcel.serialize((ZOMText) zom, interfaceC29691g);
                    break;
                case 1:
                    ZOMImage__Zarcel.serialize((ZOMImage) zom, interfaceC29691g);
                    break;
                case 2:
                    ZOMVideo__Zarcel.serialize((ZOMVideo) zom, interfaceC29691g);
                    break;
                case 3:
                    ZOMButton__Zarcel.serialize((ZOMButton) zom, interfaceC29691g);
                    break;
                case 4:
                    ZOMContainer__Zarcel.serialize((ZOMContainer) zom, interfaceC29691g);
                    break;
                case 5:
                    ZOMSlider__Zarcel.serialize((ZOMSlider) zom, interfaceC29691g);
                    break;
                case 6:
                default:
                    throw new IllegalArgumentException("Unsupported ZOM type: " + zom.mType);
                case 7:
                    ZOMSkeleton__Zarcel.serialize((ZOMSkeleton) zom, interfaceC29691g);
                    break;
                case 8:
                    ZOMInput__Zarcel.serialize((ZOMInput) zom, interfaceC29691g);
                    break;
                case 9:
                    ZOMAudio__Zarcel.serialize((ZOMAudio) zom, interfaceC29691g);
                    break;
            }
        }
    }
}
