package com.zing.zalo.shortvideo.data.model.config;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26788f;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class VideoEditConfig {
    public static final Companion Companion = new Companion(null);

    /* renamed from: q */
    private static final KSerializer[] f50160q = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C26788f(C26783d0.f126989a)};

    /* renamed from: a */
    private final Long f50161a;

    /* renamed from: b */
    private final Long f50162b;

    /* renamed from: c */
    private final Long f50163c;

    /* renamed from: d */
    private final Long f50164d;

    /* renamed from: e */
    private final String f50165e;

    /* renamed from: f */
    private final Long f50166f;

    /* renamed from: g */
    private final String f50167g;

    /* renamed from: h */
    private final Long f50168h;

    /* renamed from: i */
    private final Long f50169i;

    /* renamed from: j */
    private final Long f50170j;

    /* renamed from: k */
    private final Long f50171k;

    /* renamed from: l */
    private final Long f50172l;

    /* renamed from: m */
    private final Long f50173m;

    /* renamed from: n */
    private final Long f50174n;

    /* renamed from: o */
    private final Long f50175o;

    /* renamed from: p */
    private final List f50176p;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final VideoEditConfig m51517a(JsonObject jsonObject) {
            Long l11;
            String str;
            Long l12;
            String str2;
            Long l13;
            Long l14;
            Long l15;
            Long l16;
            Long l17;
            Long l18;
            Long l19;
            Long l21;
            JsonArray m51731l;
            int m131511r;
            List list = null;
            if (jsonObject == null) {
                return null;
            }
            long m51736q = AbstractC9465b.m51736q(jsonObject, new String[]{"minDuration"}, 0L, 2, null);
            long m51736q2 = AbstractC9465b.m51736q(jsonObject, new String[]{"maxDuration"}, 0L, 2, null);
            long m51736q3 = AbstractC9465b.m51736q(jsonObject, new String[]{"maxPickedSize"}, 0L, 2, null);
            JsonObject m51733n = AbstractC9465b.m51733n(jsonObject, "compressConfig");
            if (m51733n != null) {
                l11 = Long.valueOf(AbstractC9465b.m51736q(m51733n, new String[]{"bitrateBlend"}, 0L, 2, null));
            } else {
                l11 = null;
            }
            if (m51733n != null) {
                str = AbstractC9465b.m51742w(m51733n, new String[]{"profile"}, null, 2, null);
            } else {
                str = null;
            }
            if (m51733n != null) {
                l12 = Long.valueOf(AbstractC9465b.m51736q(m51733n, new String[]{"bitrate"}, 0L, 2, null));
            } else {
                l12 = null;
            }
            if (m51733n != null) {
                str2 = AbstractC9465b.m51742w(m51733n, new String[]{"preset"}, null, 2, null);
            } else {
                str2 = null;
            }
            if (m51733n != null) {
                l13 = Long.valueOf(AbstractC9465b.m51736q(m51733n, new String[]{"frameRate"}, 0L, 2, null));
            } else {
                l13 = null;
            }
            if (m51733n != null) {
                l14 = Long.valueOf(AbstractC9465b.m51736q(m51733n, new String[]{"resolution"}, 0L, 2, null));
            } else {
                l14 = null;
            }
            JsonObject m51733n2 = AbstractC9465b.m51733n(jsonObject, "bypassCompressConfig");
            if (m51733n2 != null) {
                l15 = Long.valueOf(AbstractC9465b.m51736q(m51733n2, new String[]{"bitrateMax"}, 0L, 2, null));
            } else {
                l15 = null;
            }
            if (m51733n2 != null) {
                l16 = Long.valueOf(AbstractC9465b.m51736q(m51733n2, new String[]{"fpsMax"}, 0L, 2, null));
            } else {
                l16 = null;
            }
            if (m51733n2 != null) {
                l17 = Long.valueOf(AbstractC9465b.m51736q(m51733n2, new String[]{"areaMax"}, 0L, 2, null));
            } else {
                l17 = null;
            }
            if (m51733n2 != null) {
                l18 = Long.valueOf(AbstractC9465b.m51736q(m51733n2, new String[]{"profileH264LevelMax"}, 0L, 2, null));
            } else {
                l18 = null;
            }
            if (m51733n2 != null) {
                l19 = Long.valueOf(AbstractC9465b.m51736q(m51733n2, new String[]{"fileSizeMax"}, 0L, 2, null));
            } else {
                l19 = null;
            }
            if (m51733n2 != null) {
                l21 = Long.valueOf(AbstractC9465b.m51736q(m51733n2, new String[]{"dimensionMax"}, 0L, 2, null));
            } else {
                l21 = null;
            }
            if (m51733n2 != null && (m51731l = AbstractC9465b.m51731l(m51733n2, "profileH264")) != null) {
                m131511r = AbstractC25370t.m131511r(m51731l, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator<JsonElement> it = m51731l.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(AbstractC9465b.m51726g(it.next())));
                }
                list = AbstractC25332a0.m131185M0(arrayList);
            }
            return new VideoEditConfig(Long.valueOf(m51736q), Long.valueOf(m51736q2), Long.valueOf(m51736q3), l11, str, l12, str2, l13, l14, l15, l16, l17, l18, l19, l21, list);
        }

        public final KSerializer serializer() {
            return VideoEditConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VideoEditConfig(int i11, Long l11, Long l12, Long l13, Long l14, String str, Long l15, String str2, Long l16, Long l17, Long l18, Long l19, Long l21, Long l22, Long l23, Long l24, List list, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50161a = null;
        } else {
            this.f50161a = l11;
        }
        if ((i11 & 2) == 0) {
            this.f50162b = null;
        } else {
            this.f50162b = l12;
        }
        if ((i11 & 4) == 0) {
            this.f50163c = null;
        } else {
            this.f50163c = l13;
        }
        if ((i11 & 8) == 0) {
            this.f50164d = null;
        } else {
            this.f50164d = l14;
        }
        if ((i11 & 16) == 0) {
            this.f50165e = null;
        } else {
            this.f50165e = str;
        }
        if ((i11 & 32) == 0) {
            this.f50166f = null;
        } else {
            this.f50166f = l15;
        }
        if ((i11 & 64) == 0) {
            this.f50167g = null;
        } else {
            this.f50167g = str2;
        }
        if ((i11 & 128) == 0) {
            this.f50168h = null;
        } else {
            this.f50168h = l16;
        }
        if ((i11 & 256) == 0) {
            this.f50169i = null;
        } else {
            this.f50169i = l17;
        }
        if ((i11 & 512) == 0) {
            this.f50170j = null;
        } else {
            this.f50170j = l18;
        }
        if ((i11 & 1024) == 0) {
            this.f50171k = null;
        } else {
            this.f50171k = l19;
        }
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.f50172l = null;
        } else {
            this.f50172l = l21;
        }
        if ((i11 & 4096) == 0) {
            this.f50173m = null;
        } else {
            this.f50173m = l22;
        }
        if ((i11 & 8192) == 0) {
            this.f50174n = null;
        } else {
            this.f50174n = l23;
        }
        if ((i11 & 16384) == 0) {
            this.f50175o = null;
        } else {
            this.f50175o = l24;
        }
        if ((i11 & 32768) == 0) {
            this.f50176p = null;
        } else {
            this.f50176p = list;
        }
    }

    /* renamed from: r */
    public static final /* synthetic */ void m51500r(VideoEditConfig videoEditConfig, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f50160q;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || videoEditConfig.f50161a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, videoEditConfig.f50161a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || videoEditConfig.f50162b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, videoEditConfig.f50162b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || videoEditConfig.f50163c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26810m0.f127024a, videoEditConfig.f50163c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || videoEditConfig.f50164d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26810m0.f127024a, videoEditConfig.f50164d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || videoEditConfig.f50165e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, videoEditConfig.f50165e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || videoEditConfig.f50166f != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26810m0.f127024a, videoEditConfig.f50166f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || videoEditConfig.f50167g != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, videoEditConfig.f50167g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || videoEditConfig.f50168h != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26810m0.f127024a, videoEditConfig.f50168h);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || videoEditConfig.f50169i != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26810m0.f127024a, videoEditConfig.f50169i);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || videoEditConfig.f50170j != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 9, C26810m0.f127024a, videoEditConfig.f50170j);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || videoEditConfig.f50171k != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 10, C26810m0.f127024a, videoEditConfig.f50171k);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || videoEditConfig.f50172l != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 11, C26810m0.f127024a, videoEditConfig.f50172l);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || videoEditConfig.f50173m != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 12, C26810m0.f127024a, videoEditConfig.f50173m);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 13) || videoEditConfig.f50174n != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 13, C26810m0.f127024a, videoEditConfig.f50174n);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 14) || videoEditConfig.f50175o != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 14, C26810m0.f127024a, videoEditConfig.f50175o);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 15) || videoEditConfig.f50176p != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 15, kSerializerArr[15], videoEditConfig.f50176p);
        }
    }

    /* renamed from: b */
    public final Long m51501b() {
        return this.f50172l;
    }

    /* renamed from: c */
    public final Long m51502c() {
        return this.f50170j;
    }

    /* renamed from: d */
    public final Long m51503d() {
        return this.f50175o;
    }

    /* renamed from: e */
    public final Long m51504e() {
        return this.f50174n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEditConfig)) {
            return false;
        }
        VideoEditConfig videoEditConfig = (VideoEditConfig) obj;
        return AbstractC19074t.m100204b(this.f50161a, videoEditConfig.f50161a) && AbstractC19074t.m100204b(this.f50162b, videoEditConfig.f50162b) && AbstractC19074t.m100204b(this.f50163c, videoEditConfig.f50163c) && AbstractC19074t.m100204b(this.f50164d, videoEditConfig.f50164d) && AbstractC19074t.m100204b(this.f50165e, videoEditConfig.f50165e) && AbstractC19074t.m100204b(this.f50166f, videoEditConfig.f50166f) && AbstractC19074t.m100204b(this.f50167g, videoEditConfig.f50167g) && AbstractC19074t.m100204b(this.f50168h, videoEditConfig.f50168h) && AbstractC19074t.m100204b(this.f50169i, videoEditConfig.f50169i) && AbstractC19074t.m100204b(this.f50170j, videoEditConfig.f50170j) && AbstractC19074t.m100204b(this.f50171k, videoEditConfig.f50171k) && AbstractC19074t.m100204b(this.f50172l, videoEditConfig.f50172l) && AbstractC19074t.m100204b(this.f50173m, videoEditConfig.f50173m) && AbstractC19074t.m100204b(this.f50174n, videoEditConfig.f50174n) && AbstractC19074t.m100204b(this.f50175o, videoEditConfig.f50175o) && AbstractC19074t.m100204b(this.f50176p, videoEditConfig.f50176p);
    }

    /* renamed from: f */
    public final Long m51505f() {
        return this.f50171k;
    }

    /* renamed from: g */
    public final List m51506g() {
        return this.f50176p;
    }

    /* renamed from: h */
    public final Long m51507h() {
        return this.f50173m;
    }

    public int hashCode() {
        Long l11 = this.f50161a;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.f50162b;
        int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f50163c;
        int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f50164d;
        int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f50165e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l15 = this.f50166f;
        int hashCode6 = (hashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str2 = this.f50167g;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l16 = this.f50168h;
        int hashCode8 = (hashCode7 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.f50169i;
        int hashCode9 = (hashCode8 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.f50170j;
        int hashCode10 = (hashCode9 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Long l19 = this.f50171k;
        int hashCode11 = (hashCode10 + (l19 == null ? 0 : l19.hashCode())) * 31;
        Long l21 = this.f50172l;
        int hashCode12 = (hashCode11 + (l21 == null ? 0 : l21.hashCode())) * 31;
        Long l22 = this.f50173m;
        int hashCode13 = (hashCode12 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l23 = this.f50174n;
        int hashCode14 = (hashCode13 + (l23 == null ? 0 : l23.hashCode())) * 31;
        Long l24 = this.f50175o;
        int hashCode15 = (hashCode14 + (l24 == null ? 0 : l24.hashCode())) * 31;
        List list = this.f50176p;
        return hashCode15 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: i */
    public final Long m51508i() {
        return this.f50166f;
    }

    /* renamed from: j */
    public final Long m51509j() {
        return this.f50164d;
    }

    /* renamed from: k */
    public final Long m51510k() {
        return this.f50168h;
    }

    /* renamed from: l */
    public final String m51511l() {
        return this.f50167g;
    }

    /* renamed from: m */
    public final String m51512m() {
        return this.f50165e;
    }

    /* renamed from: n */
    public final Long m51513n() {
        return this.f50169i;
    }

    /* renamed from: o */
    public final Long m51514o() {
        return this.f50162b;
    }

    /* renamed from: p */
    public final Long m51515p() {
        return this.f50163c;
    }

    /* renamed from: q */
    public final Long m51516q() {
        return this.f50161a;
    }

    public String toString() {
        return "VideoEditConfig(minDuration=" + this.f50161a + ", maxDuration=" + this.f50162b + ", maxPickedSize=" + this.f50163c + ", compressBitrateBlend=" + this.f50164d + ", compressProfile=" + this.f50165e + ", compressBitrate=" + this.f50166f + ", compressPreset=" + this.f50167g + ", compressFrameRate=" + this.f50168h + ", compressResolution=" + this.f50169i + ", bypassCompressBitrateMax=" + this.f50170j + ", bypassCompressFpsMax=" + this.f50171k + ", bypassCompressAreaMax=" + this.f50172l + ", bypassCompressProfileH264LevelMax=" + this.f50173m + ", bypassCompressFileSizeMax=" + this.f50174n + ", bypassCompressDimensionMax=" + this.f50175o + ", bypassCompressProfileH264=" + this.f50176p + ")";
    }

    public VideoEditConfig(Long l11, Long l12, Long l13, Long l14, String str, Long l15, String str2, Long l16, Long l17, Long l18, Long l19, Long l21, Long l22, Long l23, Long l24, List list) {
        this.f50161a = l11;
        this.f50162b = l12;
        this.f50163c = l13;
        this.f50164d = l14;
        this.f50165e = str;
        this.f50166f = l15;
        this.f50167g = str2;
        this.f50168h = l16;
        this.f50169i = l17;
        this.f50170j = l18;
        this.f50171k = l19;
        this.f50172l = l21;
        this.f50173m = l22;
        this.f50174n = l23;
        this.f50175o = l24;
        this.f50176p = list;
    }
}
