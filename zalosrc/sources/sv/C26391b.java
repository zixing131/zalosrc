package sv;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;

/* renamed from: sv.b */
/* loaded from: classes4.dex */
public final class C26391b {

    /* renamed from: a */
    private final MediaCodecInfo f125375a;

    public C26391b(MediaCodecInfo mediaCodecInfo) {
        AbstractC19074t.m100208f(mediaCodecInfo, "mediaCodecInfo");
        this.f125375a = mediaCodecInfo;
    }

    /* renamed from: a */
    public final String m135991a() {
        String name;
        String str;
        if (Build.VERSION.SDK_INT >= 29) {
            name = this.f125375a.getCanonicalName();
            str = "getCanonicalName(...)";
        } else {
            name = this.f125375a.getName();
            str = "getName(...)";
        }
        AbstractC19074t.m100207e(name, str);
        return name;
    }

    /* renamed from: b */
    public final MediaCodecInfo.CodecCapabilities m135992b(String str) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        MediaCodecInfo.CodecCapabilities capabilitiesForType = this.f125375a.getCapabilitiesForType(str);
        AbstractC19074t.m100207e(capabilitiesForType, "getCapabilitiesForType(...)");
        return capabilitiesForType;
    }

    /* renamed from: c */
    public final String m135993c() {
        String name = this.f125375a.getName();
        AbstractC19074t.m100207e(name, "getName(...)");
        return name;
    }

    /* renamed from: d */
    public final String[] m135994d() {
        String[] supportedTypes = this.f125375a.getSupportedTypes();
        AbstractC19074t.m100207e(supportedTypes, "getSupportedTypes(...)");
        return supportedTypes;
    }

    /* renamed from: e */
    public final boolean m135995e() {
        boolean isAlias;
        if (Build.VERSION.SDK_INT >= 29) {
            isAlias = this.f125375a.isAlias();
            return isAlias;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m135996f() {
        return this.f125375a.isEncoder();
    }

    /* renamed from: g */
    public final boolean m135997g() {
        boolean isHardwareAccelerated;
        if (Build.VERSION.SDK_INT >= 29) {
            isHardwareAccelerated = this.f125375a.isHardwareAccelerated();
            return isHardwareAccelerated;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m135998h() {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = this.f125375a.isSoftwareOnly();
            return isSoftwareOnly;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m135999i() {
        boolean isVendor;
        if (Build.VERSION.SDK_INT >= 29) {
            isVendor = this.f125375a.isVendor();
            return isVendor;
        }
        return false;
    }
}
