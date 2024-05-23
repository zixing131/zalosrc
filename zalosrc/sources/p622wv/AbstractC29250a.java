package p622wv;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import qm0.AbstractC25368s;
import sv.C26391b;

/* renamed from: wv.a */
/* loaded from: classes4.dex */
public abstract class AbstractC29250a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wv.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f135462q = new a();

        a() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C26391b c26391b) {
            AbstractC19074t.m100208f(c26391b, "mediaCodecInfo");
            return Boolean.valueOf(!c26391b.m135996f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wv.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f135463q = new b();

        b() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C26391b c26391b) {
            AbstractC19074t.m100208f(c26391b, "mediaCodecInfoCompat");
            boolean z11 = false;
            for (String str : c26391b.m135994d()) {
                if (AbstractC19074t.m100204b(str, "video/avc") || AbstractC19074t.m100204b(str, "video/hevc")) {
                    z11 = true;
                    break;
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wv.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final c f135464q = new c();

        c() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C26391b c26391b) {
            AbstractC19074t.m100208f(c26391b, "mediaCodecInfo");
            return Boolean.valueOf(!c26391b.m135995e());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wv.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f135465q = new d();

        d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C26391b c26391b) {
            boolean m127120J;
            AbstractC19074t.m100208f(c26391b, "mediaCodecInfo");
            String[] m135994d = c26391b.m135994d();
            int length = m135994d.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                m127120J = AbstractC24341v.m127120J(m135994d[i11], "video/", false, 2, null);
                if (m127120J) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: a */
    public static final String m146034a(List list) {
        AbstractC19074t.m100208f(list, "codecInfos");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C26391b c26391b = (C26391b) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", c26391b.m135993c());
            jSONObject.put("canonicalName", c26391b.m135991a());
            jSONObject.put("isAlias", c26391b.m135995e());
            jSONObject.put("isEncoder", c26391b.m135996f());
            jSONObject.put("isHardwareAccelerated", c26391b.m135997g());
            jSONObject.put("isSoftwareOnly", c26391b.m135998h());
            jSONObject.put("isVendor", c26391b.m135999i());
            JSONArray jSONArray2 = new JSONArray();
            JSONObject.quote("");
            for (String str : c26391b.m135994d()) {
                jSONArray2.put(str);
            }
            jSONObject.put("supportedTypes", jSONArray2);
            JSONObject jSONObject2 = new JSONObject();
            String[] m135994d = c26391b.m135994d();
            int length = m135994d.length;
            int i11 = 0;
            while (i11 < length) {
                String str2 = m135994d[i11];
                MediaCodecInfo.CodecCapabilities m135992b = c26391b.m135992b(str2);
                MediaCodecInfo.VideoCapabilities videoCapabilities = m135992b.getVideoCapabilities();
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = m135992b.profileLevels;
                AbstractC19074t.m100207e(codecProfileLevelArr, "profileLevels");
                Iterator it2 = it;
                int i12 = 0;
                for (int length2 = codecProfileLevelArr.length; i12 < length2; length2 = length2) {
                    C26391b c26391b2 = c26391b;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i12];
                    String[] strArr = m135994d;
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("profile", codecProfileLevel.profile);
                    jSONObject4.put("level", codecProfileLevel.level);
                    jSONArray3.put(jSONObject4);
                    i12++;
                    c26391b = c26391b2;
                    m135994d = strArr;
                    length = length;
                }
                C26391b c26391b3 = c26391b;
                String[] strArr2 = m135994d;
                int i13 = length;
                jSONObject3.put("profileLevels", jSONArray3);
                JSONArray jSONArray4 = new JSONArray();
                int[] iArr = m135992b.colorFormats;
                AbstractC19074t.m100207e(iArr, "colorFormats");
                for (int i14 : iArr) {
                    jSONArray4.put(i14);
                }
                jSONObject3.put("colorFormats", jSONArray4);
                JSONObject jSONObject5 = new JSONObject();
                JSONArray jSONArray5 = new JSONArray();
                Integer lower = videoCapabilities.getBitrateRange().getLower();
                AbstractC19074t.m100207e(lower, "getLower(...)");
                jSONArray5.put(lower.intValue());
                Integer upper = videoCapabilities.getBitrateRange().getUpper();
                AbstractC19074t.m100207e(upper, "getUpper(...)");
                jSONArray5.put(upper.intValue());
                jSONObject5.put("bitrateRange", jSONArray5);
                jSONObject5.put("heightAlignment", videoCapabilities.getHeightAlignment());
                JSONArray jSONArray6 = new JSONArray();
                Integer lower2 = videoCapabilities.getSupportedFrameRates().getLower();
                AbstractC19074t.m100207e(lower2, "getLower(...)");
                jSONArray6.put(lower2.intValue());
                Integer upper2 = videoCapabilities.getSupportedFrameRates().getUpper();
                AbstractC19074t.m100207e(upper2, "getUpper(...)");
                jSONArray6.put(upper2.intValue());
                jSONObject5.put("supportedFrameRates", jSONArray6);
                JSONArray jSONArray7 = new JSONArray();
                Integer lower3 = videoCapabilities.getSupportedHeights().getLower();
                AbstractC19074t.m100207e(lower3, "getLower(...)");
                jSONArray7.put(lower3.intValue());
                Integer upper3 = videoCapabilities.getSupportedHeights().getUpper();
                AbstractC19074t.m100207e(upper3, "getUpper(...)");
                jSONArray7.put(upper3.intValue());
                jSONObject5.put("supportedHeights", jSONArray7);
                JSONArray jSONArray8 = new JSONArray();
                Integer lower4 = videoCapabilities.getSupportedWidths().getLower();
                AbstractC19074t.m100207e(lower4, "getLower(...)");
                jSONArray8.put(lower4.intValue());
                Integer upper4 = videoCapabilities.getSupportedWidths().getUpper();
                AbstractC19074t.m100207e(upper4, "getUpper(...)");
                jSONArray8.put(upper4.intValue());
                jSONObject5.put("supportedWidths", jSONArray8);
                jSONObject5.put("widthAlignment", videoCapabilities.getWidthAlignment());
                jSONObject3.put("videoCapabilities", jSONObject5);
                jSONObject2.put(str2, jSONObject3);
                i11++;
                it = it2;
                c26391b = c26391b3;
                m135994d = strArr2;
                length = i13;
            }
            jSONObject.put("capabilities", jSONObject2);
            jSONArray.put(jSONObject);
            it = it;
        }
        String jSONArray9 = jSONArray.toString(1);
        AbstractC19074t.m100207e(jSONArray9, "toString(...)");
        return jSONArray9;
    }

    /* renamed from: b */
    public static final List m146035b(boolean z11, boolean z12) {
        List m131506n;
        m131506n = AbstractC25368s.m131506n(c.f135464q, d.f135465q);
        if (z12) {
            m131506n.add(a.f135462q);
        }
        if (z11) {
            m131506n.add(b.f135463q);
        }
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        AbstractC19074t.m100207e(codecInfos, "getCodecInfos(...)");
        ArrayList arrayList = new ArrayList(codecInfos.length);
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            AbstractC19074t.m100205c(mediaCodecInfo);
            arrayList.add(new C26391b(mediaCodecInfo));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C26391b c26391b = (C26391b) obj;
            List list = m131506n;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) ((InterfaceC18505l) it.next()).mo205i9(c26391b)).booleanValue()) {
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        return arrayList2;
    }

    /* renamed from: c */
    public static /* synthetic */ List m146036c(boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return m146035b(z11, z12);
    }
}
