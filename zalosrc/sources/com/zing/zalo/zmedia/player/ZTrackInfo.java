package com.zing.zalo.zmedia.player;

import android.text.TextUtils;
import pl0.C24828i;
import pl0.C24829j;
import pl0.InterfaceC24820a;

/* loaded from: classes7.dex */
public class ZTrackInfo {
    private C24829j.a mStreamMeta;
    private int mTrackType = 0;

    public ZTrackInfo(C24829j.a aVar) {
        this.mStreamMeta = aVar;
    }

    public InterfaceC24820a getFormat() {
        return new C24828i(this.mStreamMeta);
    }

    public String getInfoInline() {
        StringBuilder sb2 = new StringBuilder(128);
        int i11 = this.mTrackType;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        sb2.append("UNKNOWN");
                    } else {
                        sb2.append("SUBTITLE");
                    }
                } else {
                    sb2.append("TIMEDTEXT");
                    sb2.append(", ");
                    sb2.append(this.mStreamMeta.f119206d);
                }
            } else {
                sb2.append("AUDIO");
                sb2.append(", ");
                sb2.append(this.mStreamMeta.m129103b());
                sb2.append(", ");
                sb2.append(this.mStreamMeta.m129102a());
                sb2.append(", ");
                sb2.append(this.mStreamMeta.m129109h());
            }
        } else {
            sb2.append("VIDEO");
            sb2.append(", ");
            sb2.append(this.mStreamMeta.m129103b());
            sb2.append(", ");
            sb2.append(this.mStreamMeta.m129102a());
            sb2.append(", ");
            sb2.append(this.mStreamMeta.m129108g());
        }
        return sb2.toString();
    }

    public String getLanguage() {
        C24829j.a aVar = this.mStreamMeta;
        if (aVar != null && !TextUtils.isEmpty(aVar.f119206d)) {
            return this.mStreamMeta.f119206d;
        }
        return "und";
    }

    public int getTrackType() {
        return this.mTrackType;
    }

    public void setMediaMeta(C24829j.a aVar) {
        this.mStreamMeta = aVar;
    }

    public void setTrackType(int i11) {
        this.mTrackType = i11;
    }

    public String toString() {
        return getClass().getSimpleName() + '{' + getInfoInline() + "}";
    }
}
