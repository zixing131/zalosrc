package com.adtima.ads.partner;

import java.util.List;
import p309l.C21976d;
import p309l.EnumC21975c;

/* loaded from: classes2.dex */
public interface ZAdsAudioPartnerListener {
    void onAudioClick(String str, List<String> list);

    void onAudioError(String str, List<String> list);

    void onAudioEvent(EnumC21975c enumC21975c, List<String> list);

    void onAudioImpression(List<String> list);

    void onAudioReady(C21976d c21976d);
}
