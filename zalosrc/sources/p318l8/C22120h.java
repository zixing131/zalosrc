package p318l8;

import android.util.Base64;
import android.util.JsonReader;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import p292k8.AbstractC21569b0;
import p292k8.C21566a;
import p292k8.C21571c0;
import p520t8.InterfaceC26582a;
import p571v8.C27945d;

/* renamed from: l8.h */
/* loaded from: classes.dex */
public class C22120h {

    /* renamed from: a */
    private static final InterfaceC26582a f108867a = new C27945d().m140808j(C21566a.f104596a).m140809k(true).m140807i();

    /* renamed from: l8.h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        Object mo115336a(JsonReader jsonReader);
    }

    /* renamed from: A */
    private static AbstractC21569b0.d m115337A(JsonReader jsonReader) {
        AbstractC21569b0.d.a m111297a = AbstractC21569b0.d.m111297a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("files")) {
                if (!nextName.equals("orgId")) {
                    jsonReader.skipValue();
                } else {
                    m111297a.mo111302c(jsonReader.nextString());
                }
            } else {
                m111297a.mo111301b(m115351l(jsonReader, new a() { // from class: l8.b
                    @Override // p318l8.C22120h.a
                    /* renamed from: a */
                    public final Object mo115336a(JsonReader jsonReader2) {
                        AbstractC21569b0.d.b m115365z;
                        m115365z = C22120h.m115365z(jsonReader2);
                        return m115365z;
                    }
                }));
            }
        }
        jsonReader.endObject();
        return m111297a.mo111300a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: B */
    private static AbstractC21569b0.e.AbstractC32869e m115338B(JsonReader jsonReader) {
        AbstractC21569b0.e.AbstractC32869e.a m111481a = AbstractC21569b0.e.AbstractC32869e.m111481a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111481a.mo111487b(jsonReader.nextString());
                    break;
                case 1:
                    m111481a.mo111488c(jsonReader.nextBoolean());
                    break;
                case 2:
                    m111481a.mo111490e(jsonReader.nextString());
                    break;
                case 3:
                    m111481a.mo111489d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111481a.mo111486a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: C */
    private static AbstractC21569b0 m115339C(JsonReader jsonReader) {
        AbstractC21569b0.b m111258b = AbstractC21569b0.m111258b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c11 = '\b';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111258b.mo111253g(m115337A(jsonReader));
                    break;
                case 1:
                    m111258b.mo111255i(jsonReader.nextString());
                    break;
                case 2:
                    m111258b.mo111248b(m115350k(jsonReader));
                    break;
                case 3:
                    m111258b.mo111249c(jsonReader.nextString());
                    break;
                case 4:
                    m111258b.mo111251e(jsonReader.nextString());
                    break;
                case 5:
                    m111258b.mo111252f(jsonReader.nextString());
                    break;
                case 6:
                    m111258b.mo111254h(jsonReader.nextInt());
                    break;
                case 7:
                    m111258b.mo111250d(jsonReader.nextString());
                    break;
                case '\b':
                    m111258b.mo111256j(m115340D(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111258b.mo111247a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: D */
    private static AbstractC21569b0.e m115340D(JsonReader jsonReader) {
        AbstractC21569b0.e.b m111309a = AbstractC21569b0.e.m111309a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c11 = '\b';
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c11 = '\t';
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c11 = '\n';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111309a.mo111351l(jsonReader.nextLong());
                    break;
                case 1:
                    m111309a.m111349j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    m111309a.mo111344e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    m111309a.mo111343d(m115354o(jsonReader));
                    break;
                case 4:
                    m111309a.mo111345f(m115351l(jsonReader, new a() { // from class: l8.a
                        @Override // p318l8.C22120h.a
                        /* renamed from: a */
                        public final Object mo115336a(JsonReader jsonReader2) {
                            AbstractC21569b0.e.d m115355p;
                            m115355p = C22120h.m115355p(jsonReader2);
                            return m115355p;
                        }
                    }));
                    break;
                case 5:
                    m111309a.mo111350k(m115338B(jsonReader));
                    break;
                case 6:
                    m111309a.mo111341b(m115349j(jsonReader));
                    break;
                case 7:
                    m111309a.mo111352m(m115341E(jsonReader));
                    break;
                case '\b':
                    m111309a.mo111346g(jsonReader.nextString());
                    break;
                case '\t':
                    m111309a.mo111342c(jsonReader.nextBoolean());
                    break;
                case '\n':
                    m111309a.mo111347h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111309a.mo111340a();
    }

    /* renamed from: E */
    private static AbstractC21569b0.e.f m115341E(JsonReader jsonReader) {
        AbstractC21569b0.e.f.a m111491a = AbstractC21569b0.e.f.m111491a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                m111491a.mo111494b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m111491a.mo111493a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: j */
    private static AbstractC21569b0.e.a m115349j(JsonReader jsonReader) {
        AbstractC21569b0.e.a.AbstractC32856a m111325a = AbstractC21569b0.e.a.m111325a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c11 = 5;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111325a.mo111337e(jsonReader.nextString());
                    break;
                case 1:
                    m111325a.mo111334b(jsonReader.nextString());
                    break;
                case 2:
                    m111325a.mo111335c(jsonReader.nextString());
                    break;
                case 3:
                    m111325a.mo111339g(jsonReader.nextString());
                    break;
                case 4:
                    m111325a.mo111338f(jsonReader.nextString());
                    break;
                case 5:
                    m111325a.mo111336d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111325a.mo111333a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: k */
    private static AbstractC21569b0.a m115350k(JsonReader jsonReader) {
        AbstractC21569b0.a.b m111263a = AbstractC21569b0.a.m111263a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c11 = '\b';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111263a.mo111282b(m115351l(jsonReader, new a() { // from class: l8.d
                        @Override // p318l8.C22120h.a
                        /* renamed from: a */
                        public final Object mo115336a(JsonReader jsonReader2) {
                            AbstractC21569b0.a.AbstractC32854a m115352m;
                            m115352m = C22120h.m115352m(jsonReader2);
                            return m115352m;
                        }
                    }));
                    break;
                case 1:
                    m111263a.mo111284d(jsonReader.nextInt());
                    break;
                case 2:
                    m111263a.mo111286f(jsonReader.nextLong());
                    break;
                case 3:
                    m111263a.mo111288h(jsonReader.nextLong());
                    break;
                case 4:
                    m111263a.mo111289i(jsonReader.nextLong());
                    break;
                case 5:
                    m111263a.mo111285e(jsonReader.nextString());
                    break;
                case 6:
                    m111263a.mo111287g(jsonReader.nextInt());
                    break;
                case 7:
                    m111263a.mo111290j(jsonReader.nextString());
                    break;
                case '\b':
                    m111263a.mo111283c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111263a.mo111281a();
    }

    /* renamed from: l */
    private static C21571c0 m115351l(JsonReader jsonReader, a aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo115336a(jsonReader));
        }
        jsonReader.endArray();
        return C21571c0.m111495d(arrayList);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: m */
    public static AbstractC21569b0.a.AbstractC32854a m115352m(JsonReader jsonReader) {
        AbstractC21569b0.a.AbstractC32854a.AbstractC32855a m111273a = AbstractC21569b0.a.AbstractC32854a.m111273a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals("buildId")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111273a.mo111280d(jsonReader.nextString());
                    break;
                case 1:
                    m111273a.mo111278b(jsonReader.nextString());
                    break;
                case 2:
                    m111273a.mo111279c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111273a.mo111277a();
    }

    /* renamed from: n */
    public static AbstractC21569b0.c m115353n(JsonReader jsonReader) {
        AbstractC21569b0.c.a m111291a = AbstractC21569b0.c.m111291a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    m111291a.mo111296c(jsonReader.nextString());
                }
            } else {
                m111291a.mo111295b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m111291a.mo111294a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: o */
    private static AbstractC21569b0.e.c m115354o(JsonReader jsonReader) {
        AbstractC21569b0.e.c.a m111353a = AbstractC21569b0.e.c.m111353a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c11 = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c11 = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c11 = '\b';
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111353a.mo111371i(jsonReader.nextBoolean());
                    break;
                case 1:
                    m111353a.mo111367e(jsonReader.nextString());
                    break;
                case 2:
                    m111353a.mo111370h(jsonReader.nextLong());
                    break;
                case 3:
                    m111353a.mo111364b(jsonReader.nextInt());
                    break;
                case 4:
                    m111353a.mo111366d(jsonReader.nextLong());
                    break;
                case 5:
                    m111353a.mo111365c(jsonReader.nextInt());
                    break;
                case 6:
                    m111353a.mo111368f(jsonReader.nextString());
                    break;
                case 7:
                    m111353a.mo111372j(jsonReader.nextInt());
                    break;
                case '\b':
                    m111353a.mo111369g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111353a.mo111363a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: p */
    public static AbstractC21569b0.e.d m115355p(JsonReader jsonReader) {
        AbstractC21569b0.e.d.b m111373a = AbstractC21569b0.e.d.m111373a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111373a.mo111459c(m115358s(jsonReader));
                    break;
                case 1:
                    m111373a.mo111458b(m115356q(jsonReader));
                    break;
                case 2:
                    m111373a.mo111460d(m115362w(jsonReader));
                    break;
                case 3:
                    m111373a.mo111462f(jsonReader.nextString());
                    break;
                case 4:
                    m111373a.mo111461e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111373a.mo111457a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: q */
    private static AbstractC21569b0.e.d.a m115356q(JsonReader jsonReader) {
        AbstractC21569b0.e.d.a.AbstractC32857a m111380a = AbstractC21569b0.e.d.a.m111380a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111380a.mo111388b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    m111380a.mo111390d(m115359t(jsonReader));
                    break;
                case 2:
                    m111380a.mo111391e(m115351l(jsonReader, new a() { // from class: l8.c
                        @Override // p318l8.C22120h.a
                        /* renamed from: a */
                        public final Object mo115336a(JsonReader jsonReader2) {
                            AbstractC21569b0.c m115353n;
                            m115353n = C22120h.m115353n(jsonReader2);
                            return m115353n;
                        }
                    }));
                    break;
                case 3:
                    m111380a.mo111389c(m115351l(jsonReader, new a() { // from class: l8.c
                        @Override // p318l8.C22120h.a
                        /* renamed from: a */
                        public final Object mo115336a(JsonReader jsonReader2) {
                            AbstractC21569b0.c m115353n;
                            m115353n = C22120h.m115353n(jsonReader2);
                            return m115353n;
                        }
                    }));
                    break;
                case 4:
                    m111380a.mo111392f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111380a.mo111387a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: r */
    public static AbstractC21569b0.e.d.a.b.AbstractC32858a m115357r(JsonReader jsonReader) {
        AbstractC21569b0.e.d.a.b.AbstractC32858a.AbstractC32859a m111399a = AbstractC21569b0.e.d.a.b.AbstractC32858a.m111399a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111399a.mo111407c(jsonReader.nextString());
                    break;
                case 1:
                    m111399a.mo111408d(jsonReader.nextLong());
                    break;
                case 2:
                    m111399a.m111410f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    m111399a.mo111406b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111399a.mo111405a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: s */
    private static AbstractC21569b0.e.d.c m115358s(JsonReader jsonReader) {
        AbstractC21569b0.e.d.c.a m111463a = AbstractC21569b0.e.d.c.m111463a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c11 = 5;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111463a.mo111471b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    m111463a.mo111472c(jsonReader.nextInt());
                    break;
                case 2:
                    m111463a.mo111474e(jsonReader.nextInt());
                    break;
                case 3:
                    m111463a.mo111473d(jsonReader.nextLong());
                    break;
                case 4:
                    m111463a.mo111476g(jsonReader.nextLong());
                    break;
                case 5:
                    m111463a.mo111475f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111463a.mo111470a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: t */
    private static AbstractC21569b0.e.d.a.b m115359t(JsonReader jsonReader) {
        AbstractC21569b0.e.d.a.b.AbstractC32860b m111393a = AbstractC21569b0.e.d.a.b.m111393a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111393a.mo111412b(m115350k(jsonReader));
                    break;
                case 1:
                    m111393a.mo111416f(m115351l(jsonReader, new a() { // from class: l8.e
                        @Override // p318l8.C22120h.a
                        /* renamed from: a */
                        public final Object mo115336a(JsonReader jsonReader2) {
                            AbstractC21569b0.e.d.a.b.AbstractC32864e m115364y;
                            m115364y = C22120h.m115364y(jsonReader2);
                            return m115364y;
                        }
                    }));
                    break;
                case 2:
                    m111393a.mo111415e(m115363x(jsonReader));
                    break;
                case 3:
                    m111393a.mo111413c(m115351l(jsonReader, new a() { // from class: l8.f
                        @Override // p318l8.C22120h.a
                        /* renamed from: a */
                        public final Object mo115336a(JsonReader jsonReader2) {
                            AbstractC21569b0.e.d.a.b.AbstractC32858a m115357r;
                            m115357r = C22120h.m115357r(jsonReader2);
                            return m115357r;
                        }
                    }));
                    break;
                case 4:
                    m111393a.mo111414d(m115360u(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111393a.mo111411a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: u */
    private static AbstractC21569b0.e.d.a.b.c m115360u(JsonReader jsonReader) {
        AbstractC21569b0.e.d.a.b.c.AbstractC32861a m111417a = AbstractC21569b0.e.d.a.b.c.m111417a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111417a.mo111425c(m115351l(jsonReader, new C22119g()));
                    break;
                case 1:
                    m111417a.mo111427e(jsonReader.nextString());
                    break;
                case 2:
                    m111417a.mo111428f(jsonReader.nextString());
                    break;
                case 3:
                    m111417a.mo111424b(m115360u(jsonReader));
                    break;
                case 4:
                    m111417a.mo111426d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111417a.mo111423a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: v */
    public static AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b m115361v(JsonReader jsonReader) {
        AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.AbstractC32867a m111445a = AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32866b.m111445a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111445a.mo111454d(jsonReader.nextLong());
                    break;
                case 1:
                    m111445a.mo111456f(jsonReader.nextString());
                    break;
                case 2:
                    m111445a.mo111455e(jsonReader.nextLong());
                    break;
                case 3:
                    m111445a.mo111452b(jsonReader.nextString());
                    break;
                case 4:
                    m111445a.mo111453c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111445a.mo111451a();
    }

    /* renamed from: w */
    private static AbstractC21569b0.e.d.AbstractC32868d m115362w(JsonReader jsonReader) {
        AbstractC21569b0.e.d.AbstractC32868d.a m111477a = AbstractC21569b0.e.d.AbstractC32868d.m111477a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                m111477a.mo111480b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m111477a.mo111479a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: x */
    private static AbstractC21569b0.e.d.a.b.AbstractC32862d m115363x(JsonReader jsonReader) {
        AbstractC21569b0.e.d.a.b.AbstractC32862d.AbstractC32863a m111429a = AbstractC21569b0.e.d.a.b.AbstractC32862d.m111429a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111429a.mo111434b(jsonReader.nextLong());
                    break;
                case 1:
                    m111429a.mo111435c(jsonReader.nextString());
                    break;
                case 2:
                    m111429a.mo111436d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111429a.mo111433a();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    /* renamed from: y */
    public static AbstractC21569b0.e.d.a.b.AbstractC32864e m115364y(JsonReader jsonReader) {
        AbstractC21569b0.e.d.a.b.AbstractC32864e.AbstractC32865a m111437a = AbstractC21569b0.e.d.a.b.AbstractC32864e.m111437a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c11 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    m111437a.mo111442b(m115351l(jsonReader, new C22119g()));
                    break;
                case 1:
                    m111437a.mo111444d(jsonReader.nextString());
                    break;
                case 2:
                    m111437a.mo111443c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m111437a.mo111441a();
    }

    /* renamed from: z */
    public static AbstractC21569b0.d.b m115365z(JsonReader jsonReader) {
        AbstractC21569b0.d.b.a m111303a = AbstractC21569b0.d.b.m111303a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("filename")) {
                if (!nextName.equals("contents")) {
                    jsonReader.skipValue();
                } else {
                    m111303a.mo111307b(Base64.decode(jsonReader.nextString(), 2));
                }
            } else {
                m111303a.mo111308c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m111303a.mo111306a();
    }

    /* renamed from: F */
    public AbstractC21569b0 m115366F(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC21569b0 m115339C = m115339C(jsonReader);
                jsonReader.close();
                return m115339C;
            } finally {
            }
        } catch (IllegalStateException e11) {
            throw new IOException(e11);
        }
    }

    /* renamed from: G */
    public String m115367G(AbstractC21569b0 abstractC21569b0) {
        return f108867a.mo136508b(abstractC21569b0);
    }

    /* renamed from: h */
    public AbstractC21569b0.e.d m115368h(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC21569b0.e.d m115355p = m115355p(jsonReader);
                jsonReader.close();
                return m115355p;
            } finally {
            }
        } catch (IllegalStateException e11) {
            throw new IOException(e11);
        }
    }

    /* renamed from: i */
    public String m115369i(AbstractC21569b0.e.d dVar) {
        return f108867a.mo136508b(dVar);
    }
}
