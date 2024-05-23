package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5283a3;
import com.google.android.gms.internal.measurement.C5285a5;
import com.google.android.gms.internal.measurement.C5300b3;
import com.google.android.gms.internal.measurement.C5302b5;
import com.google.android.gms.internal.measurement.C5336d5;
import com.google.android.gms.internal.measurement.C5370f5;
import com.google.android.gms.internal.measurement.C5403h4;
import com.google.android.gms.internal.measurement.C5436j3;
import com.google.android.gms.internal.measurement.C5437j4;
import com.google.android.gms.internal.measurement.C5453k3;
import com.google.android.gms.internal.measurement.C5471l4;
import com.google.android.gms.internal.measurement.C5649vc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p665y0.C30239a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b */
/* loaded from: classes.dex */
public final class C5933b extends AbstractC6208z8 {

    /* renamed from: d */
    private String f33777d;

    /* renamed from: e */
    private Set f33778e;

    /* renamed from: f */
    private Map f33779f;

    /* renamed from: g */
    private Long f33780g;

    /* renamed from: h */
    private Long f33781h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5933b(C6055l9 c6055l9) {
        super(c6055l9);
    }

    /* renamed from: m */
    private final C6198y9 m30799m(Integer num) {
        if (this.f33779f.containsKey(num)) {
            return (C6198y9) this.f33779f.get(num);
        }
        C6198y9 c6198y9 = new C6198y9(this, this.f33777d, null);
        this.f33779f.put(num, c6198y9);
        return c6198y9;
    }

    /* renamed from: n */
    private final boolean m30800n(int i11, int i12) {
        BitSet bitSet;
        C6198y9 c6198y9 = (C6198y9) this.f33779f.get(Integer.valueOf(i11));
        if (c6198y9 != null) {
            bitSet = c6198y9.f34632d;
            return bitSet.get(i12);
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6208z8
    /* renamed from: k */
    protected final boolean mo30801k() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:2|(2:4|(2:6|7)(1:520))(2:521|522))|8|(3:10|11|12)|16|(15:(6:19|20|21|22|23|(19:(7:25|26|27|28|(1:30)(3:495|(1:497)(1:499)|498)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:460|(6:461|462|463|464|465|(1:468)(1:467))|469)|44|(1:46)(6:289|(12:291|292|293|294|295|(6:444|304|305|(3:400|(6:403|(2:439|440)(2:407|(8:413|414|(4:417|(2:419|420)(1:422)|421|415)|423|424|(4:427|(3:429|430|431)(1:433)|432|425)|434|435)(4:409|410|411|412))|436|437|412|401)|442)|307|308)|(4:297|(1:299)|300|301)|304|305|(0)|307|308)(1:459)|309|(10:312|(3:316|(4:319|(5:321|322|(1:324)(1:328)|325|326)(1:329)|327|317)|330)|331|(3:335|(4:338|(3:343|344|345)|346|336)|349)|350|(3:352|(6:355|(2:357|(3:359|360|361))(1:364)|362|363|361|353)|365)|366|(3:375|(8:378|(1:380)|381|(1:383)|384|(3:386|387|388)(1:390)|389|376)|391)|392|310)|398|399)|47|(3:172|(4:175|(10:177|178|(1:180)(1:286)|181|(15:183|184|185|186|187|188|189|190|191|192|193|194|195|(3:197|(11:198|199|200|201|202|203|204|(3:206|207|208)(1:257)|209|210|(1:213)(1:212))|214)(3:264|265|266)|215)(1:285)|216|(4:219|(3:237|238|239)(4:221|222|(2:223|(2:225|(1:227)(2:228|229))(1:236))|(3:231|232|233)(1:235))|234|217)|240|241|242)(1:287)|243|173)|288)|49|50|(3:52|(6:55|(9:57|58|59|60|61|(4:129|130|125|76)|(9:63|64|65|66|67|68|(1:70)|71|72)|75|76)(1:147)|77|(2:78|(2:80|(3:114|115|116)(8:82|(2:83|(4:85|(3:87|(1:89)(1:91)|90)|92|(1:1)(2:96|(1:98)(2:99|100)))(1:113))|107|(1:109)(1:111)|110|102|103|104))(0))|117|53)|148)|149|(9:152|153|154|155|156|157|(2:159|160)(1:162)|161|150)|170|171)(2:503|504))|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|149|(1:150)|170|171)|519|36|37|38|(4:(0)|(0)|(0)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:(6:19|20|21|22|23|(19:(7:25|26|27|28|(1:30)(3:495|(1:497)(1:499)|498)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:460|(6:461|462|463|464|465|(1:468)(1:467))|469)|44|(1:46)(6:289|(12:291|292|293|294|295|(6:444|304|305|(3:400|(6:403|(2:439|440)(2:407|(8:413|414|(4:417|(2:419|420)(1:422)|421|415)|423|424|(4:427|(3:429|430|431)(1:433)|432|425)|434|435)(4:409|410|411|412))|436|437|412|401)|442)|307|308)|(4:297|(1:299)|300|301)|304|305|(0)|307|308)(1:459)|309|(10:312|(3:316|(4:319|(5:321|322|(1:324)(1:328)|325|326)(1:329)|327|317)|330)|331|(3:335|(4:338|(3:343|344|345)|346|336)|349)|350|(3:352|(6:355|(2:357|(3:359|360|361))(1:364)|362|363|361|353)|365)|366|(3:375|(8:378|(1:380)|381|(1:383)|384|(3:386|387|388)(1:390)|389|376)|391)|392|310)|398|399)|47|(3:172|(4:175|(10:177|178|(1:180)(1:286)|181|(15:183|184|185|186|187|188|189|190|191|192|193|194|195|(3:197|(11:198|199|200|201|202|203|204|(3:206|207|208)(1:257)|209|210|(1:213)(1:212))|214)(3:264|265|266)|215)(1:285)|216|(4:219|(3:237|238|239)(4:221|222|(2:223|(2:225|(1:227)(2:228|229))(1:236))|(3:231|232|233)(1:235))|234|217)|240|241|242)(1:287)|243|173)|288)|49|50|(3:52|(6:55|(9:57|58|59|60|61|(4:129|130|125|76)|(9:63|64|65|66|67|68|(1:70)|71|72)|75|76)(1:147)|77|(2:78|(2:80|(3:114|115|116)(8:82|(2:83|(4:85|(3:87|(1:89)(1:91)|90)|92|(1:1)(2:96|(1:98)(2:99|100)))(1:113))|107|(1:109)(1:111)|110|102|103|104))(0))|117|53)|148)|149|(9:152|153|154|155|156|157|(2:159|160)(1:162)|161|150)|170|171)(2:503|504))|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|149|(1:150)|170|171) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0a24, code lost:            if (r8 != false) goto L475;     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0907, code lost:            if (r9 == null) goto L361;     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x02eb, code lost:            if (r5 == null) goto L124;     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x01c5, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x01c6, code lost:            r20 = "audience_id";     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x022a, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x022b, code lost:            r20 = "audience_id";     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0231, code lost:            r4 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0228, code lost:            r0 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x022e, code lost:            r5 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0177, code lost:            if (r5 == null) goto L45;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b7 A[Catch: all -> 0x01c3, SQLiteException -> 0x01c5, TRY_LEAVE, TryCatch #20 {all -> 0x01c3, blocks: (B:40:0x01b1, B:42:0x01b7, B:460:0x01ca, B:461:0x01cf, B:463:0x01d9, B:464:0x01e9, B:465:0x0211, B:478:0x01f6, B:481:0x020a, B:472:0x0232), top: B:39:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x01ca A[Catch: all -> 0x01c3, SQLiteException -> 0x01c5, TRY_ENTER, TryCatch #20 {all -> 0x01c3, blocks: (B:40:0x01b1, B:42:0x01b7, B:460:0x01ca, B:461:0x01cf, B:463:0x01d9, B:464:0x01e9, B:465:0x0211, B:478:0x01f6, B:481:0x020a, B:472:0x0232), top: B:39:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0823  */
    /* JADX WARN: Type inference failed for: r0v188, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v29, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m30802l(String str, List list, List list2, Long l11, Long l12) {
        int i11;
        int i12;
        boolean z11;
        Cursor cursor;
        Map map;
        String str2;
        Cursor cursor2;
        Map map2;
        String str3;
        Map map3;
        String str4;
        String str5;
        String str6;
        List<C5300b3> list3;
        String str7;
        ?? r52;
        Cursor cursor3;
        Map map4;
        Iterator it;
        String str8;
        C6100q c6100q;
        C6209z9 c6209z9;
        Iterator it2;
        C6100q c6100q2;
        String str9;
        Iterator it3;
        Cursor cursor4;
        String[] strArr;
        String str10;
        Cursor query;
        List list4;
        Iterator it4;
        C5453k3 c5453k3;
        Cursor cursor5;
        Cursor cursor6;
        C30239a c30239a;
        Cursor cursor7;
        Cursor cursor8;
        List list5;
        String str11 = "current_results";
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19722k(list);
        AbstractC4205o.m19722k(list2);
        this.f33777d = str;
        this.f33778e = new HashSet();
        this.f33779f = new C30239a();
        this.f33780g = l11;
        this.f33781h = l12;
        Iterator it5 = list.iterator();
        while (true) {
            i11 = 0;
            i12 = 1;
            if (!it5.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((C5471l4) it5.next()).m29398H())) {
                z11 = true;
                break;
            }
        }
        C5649vc.m29807b();
        boolean m30913B = this.f34158a.m31401z().m30913B(this.f33777d, AbstractC5972e3.f33908a0);
        C5649vc.m29807b();
        boolean m30913B2 = this.f34158a.m31401z().m30913B(this.f33777d, AbstractC5972e3.f33906Z);
        if (z11) {
            C6034k m31074W = this.f34628b.m31074W();
            String str12 = this.f33777d;
            m31074W.m31504h();
            m31074W.mo31036g();
            AbstractC4205o.m19718g(str12);
            ?? contentValues = new ContentValues();
            ?? r53 = 0;
            contentValues.put("current_session_count", r53);
            try {
                r53 = "events";
                m31074W.m30988P().update("events", contentValues, "app_id = ?", new String[]{str12});
                cursor = "events";
            } catch (SQLiteException e11) {
                m31074W.f34158a.mo31033c().m31197q().m31110c("Error resetting session-scoped event counts. appId", C6082o3.m31193z(str12), e11);
                cursor = r53;
            }
        }
        Map emptyMap = Collections.emptyMap();
        String str13 = "Failed to merge filter. appId";
        String str14 = "Database error querying filters. appId";
        String str15 = "audience_id";
        try {
            if (m30913B2 && m30913B) {
                C6034k m31074W2 = this.f34628b.m31074W();
                String str16 = this.f33777d;
                AbstractC4205o.m19718g(str16);
                C30239a c30239a2 = new C30239a();
                try {
                    try {
                        cursor8 = m31074W2.m30988P().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                    } catch (SQLiteException e12) {
                        e = e12;
                        cursor8 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor7 = null;
                        if (cursor7 != null) {
                        }
                        throw th;
                    }
                    try {
                    } catch (SQLiteException e13) {
                        e = e13;
                        m31074W2.f34158a.mo31033c().m31197q().m31110c("Database error querying filters. appId", C6082o3.m31193z(str16), e);
                        emptyMap = Collections.emptyMap();
                    }
                    if (cursor8.moveToFirst()) {
                        while (true) {
                            try {
                                C5300b3 c5300b3 = (C5300b3) ((C5283a3) C6077n9.m31151C(C5300b3.m28905C(), cursor8.getBlob(i12))).m29557k();
                                if (c5300b3.m28918O()) {
                                    Integer valueOf = Integer.valueOf(cursor8.getInt(i11));
                                    List list6 = (List) c30239a2.get(valueOf);
                                    if (list6 == null) {
                                        list5 = new ArrayList();
                                        c30239a2.put(valueOf, list5);
                                    } else {
                                        list5 = list6;
                                    }
                                    list5.add(c5300b3);
                                }
                            } catch (IOException e14) {
                                m31074W2.f34158a.mo31033c().m31197q().m31110c("Failed to merge filter. appId", C6082o3.m31193z(str16), e14);
                            }
                            if (!cursor8.moveToNext()) {
                                break;
                            }
                            i11 = 0;
                            i12 = 1;
                        }
                        cursor8.close();
                        map = c30239a2;
                        C6034k m31074W3 = this.f34628b.m31074W();
                        String str17 = this.f33777d;
                        m31074W3.m31504h();
                        m31074W3.mo31036g();
                        AbstractC4205o.m19718g(str17);
                        cursor2 = m31074W3.m30988P().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str17}, null, null, null);
                        if (cursor2.moveToFirst()) {
                            Map emptyMap2 = Collections.emptyMap();
                            cursor2.close();
                            map2 = emptyMap2;
                            str2 = "audience_id";
                        } else {
                            C30239a c30239a3 = new C30239a();
                            while (true) {
                                int i13 = cursor2.getInt(0);
                                try {
                                    c30239a3.put(Integer.valueOf(i13), (C5302b5) ((C5285a5) C6077n9.m31151C(C5302b5.m28925E(), cursor2.getBlob(1))).m29557k());
                                    c30239a = c30239a3;
                                    str2 = str15;
                                } catch (IOException e15) {
                                    c30239a = c30239a3;
                                    str2 = str15;
                                    try {
                                        m31074W3.f34158a.mo31033c().m31197q().m31111d("Failed to merge filter results. appId, audienceId, error", C6082o3.m31193z(str17), Integer.valueOf(i13), e15);
                                    } catch (SQLiteException e16) {
                                        e = e16;
                                        m31074W3.f34158a.mo31033c().m31197q().m31110c("Database error querying filter results. appId", C6082o3.m31193z(str17), e);
                                        Map emptyMap3 = Collections.emptyMap();
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        map2 = emptyMap3;
                                        if (map2.isEmpty()) {
                                        }
                                        if (!list.isEmpty()) {
                                        }
                                        String str18 = str11;
                                        if (!list2.isEmpty()) {
                                        }
                                        ArrayList arrayList = new ArrayList();
                                        Set keySet = this.f33779f.keySet();
                                        keySet.removeAll(this.f33778e);
                                        it4 = keySet.iterator();
                                        while (it4.hasNext()) {
                                        }
                                        return arrayList;
                                    }
                                }
                                if (!cursor2.moveToNext()) {
                                    break;
                                }
                                c30239a3 = c30239a;
                                str15 = str2;
                            }
                            cursor2.close();
                            map2 = c30239a;
                        }
                        if (map2.isEmpty()) {
                            str6 = "Database error querying filters. appId";
                            str4 = "Failed to merge filter. appId";
                            str5 = str2;
                        } else {
                            HashSet hashSet = new HashSet(map2.keySet());
                            if (z11) {
                                String str19 = this.f33777d;
                                C6034k m31074W4 = this.f34628b.m31074W();
                                String str20 = this.f33777d;
                                m31074W4.m31504h();
                                m31074W4.mo31036g();
                                AbstractC4205o.m19718g(str20);
                                Map c30239a4 = new C30239a();
                                SQLiteDatabase m30988P = m31074W4.m30988P();
                                try {
                                    try {
                                        cursor3 = m30988P.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str20, str20});
                                    } catch (SQLiteException e17) {
                                        e = e17;
                                        cursor3 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r52 = 0;
                                        if (r52 != 0) {
                                        }
                                        throw th;
                                    }
                                    try {
                                    } catch (SQLiteException e18) {
                                        e = e18;
                                        m31074W4.f34158a.mo31033c().m31197q().m31110c("Database error querying scoped filters. appId", C6082o3.m31193z(str20), e);
                                        c30239a4 = Collections.emptyMap();
                                    }
                                    if (!cursor3.moveToFirst()) {
                                        c30239a4 = Collections.emptyMap();
                                        cursor3.close();
                                        AbstractC4205o.m19718g(str19);
                                        AbstractC4205o.m19722k(map2);
                                        C30239a c30239a5 = new C30239a();
                                        if (!map2.isEmpty()) {
                                            Iterator it6 = map2.keySet().iterator();
                                            while (it6.hasNext()) {
                                                int intValue = ((Integer) it6.next()).intValue();
                                                Integer valueOf2 = Integer.valueOf(intValue);
                                                C5302b5 c5302b5 = (C5302b5) map2.get(valueOf2);
                                                List list7 = (List) c30239a4.get(valueOf2);
                                                if (list7 != null && !list7.isEmpty()) {
                                                    map4 = c30239a4;
                                                    List m31172G = this.f34628b.m31085g0().m31172G(c5302b5.m28941I(), list7);
                                                    if (m31172G.isEmpty()) {
                                                        c30239a4 = map4;
                                                    } else {
                                                        C5285a5 c5285a5 = (C5285a5) c5302b5.m29649i();
                                                        c5285a5.m28870u();
                                                        c5285a5.m28866p(m31172G);
                                                        it = it6;
                                                        List m31172G2 = this.f34628b.m31085g0().m31172G(c5302b5.m28943L(), list7);
                                                        c5285a5.m28872w();
                                                        c5285a5.m28868r(m31172G2);
                                                        ArrayList arrayList2 = new ArrayList();
                                                        Iterator it7 = c5302b5.m28940H().iterator();
                                                        while (it7.hasNext()) {
                                                            Iterator it8 = it7;
                                                            C5437j4 c5437j4 = (C5437j4) it7.next();
                                                            String str21 = str14;
                                                            if (!list7.contains(Integer.valueOf(c5437j4.m29276A()))) {
                                                                arrayList2.add(c5437j4);
                                                            }
                                                            it7 = it8;
                                                            str14 = str21;
                                                        }
                                                        str8 = str14;
                                                        c5285a5.m28869s();
                                                        c5285a5.m28865o(arrayList2);
                                                        ArrayList arrayList3 = new ArrayList();
                                                        for (C5336d5 c5336d5 : c5302b5.m28942J()) {
                                                            if (!list7.contains(Integer.valueOf(c5336d5.m29060B()))) {
                                                                arrayList3.add(c5336d5);
                                                            }
                                                        }
                                                        c5285a5.m28871v();
                                                        c5285a5.m28867q(arrayList3);
                                                        c30239a5.put(Integer.valueOf(intValue), (C5302b5) c5285a5.m29557k());
                                                    }
                                                } else {
                                                    map4 = c30239a4;
                                                    it = it6;
                                                    str8 = str14;
                                                    c30239a5.put(valueOf2, c5302b5);
                                                }
                                                c30239a4 = map4;
                                                it6 = it;
                                                str14 = str8;
                                            }
                                        }
                                        str3 = str14;
                                        map3 = c30239a5;
                                    }
                                    do {
                                        Integer valueOf3 = Integer.valueOf(cursor3.getInt(0));
                                        List list8 = (List) c30239a4.get(valueOf3);
                                        if (list8 == null) {
                                            list8 = new ArrayList();
                                            c30239a4.put(valueOf3, list8);
                                        }
                                        list8.add(Integer.valueOf(cursor3.getInt(1)));
                                    } while (cursor3.moveToNext());
                                    cursor3.close();
                                    AbstractC4205o.m19718g(str19);
                                    AbstractC4205o.m19722k(map2);
                                    C30239a c30239a52 = new C30239a();
                                    if (!map2.isEmpty()) {
                                    }
                                    str3 = str14;
                                    map3 = c30239a52;
                                } catch (Throwable th4) {
                                    th = th4;
                                    r52 = m30988P;
                                    if (r52 != 0) {
                                        r52.close();
                                    }
                                    throw th;
                                }
                            } else {
                                str3 = "Database error querying filters. appId";
                                map3 = map2;
                            }
                            Iterator it9 = hashSet.iterator();
                            while (it9.hasNext()) {
                                int intValue2 = ((Integer) it9.next()).intValue();
                                C5302b5 c5302b52 = (C5302b5) map3.get(Integer.valueOf(intValue2));
                                BitSet bitSet = new BitSet();
                                BitSet bitSet2 = new BitSet();
                                C30239a c30239a6 = new C30239a();
                                if (c5302b52 != null && c5302b52.m28936A() != 0) {
                                    for (C5437j4 c5437j42 : c5302b52.m28940H()) {
                                        if (c5437j42.m29279H()) {
                                            c30239a6.put(Integer.valueOf(c5437j42.m29276A()), c5437j42.m29278G() ? Long.valueOf(c5437j42.m29277B()) : null);
                                        }
                                    }
                                }
                                C30239a c30239a7 = new C30239a();
                                if (c5302b52 != null && c5302b52.m28938C() != 0) {
                                    for (C5336d5 c5336d52 : c5302b52.m28942J()) {
                                        if (c5336d52.m29063I() && c5336d52.m29059A() > 0) {
                                            c30239a7.put(Integer.valueOf(c5336d52.m29060B()), Long.valueOf(c5336d52.m29061C(c5336d52.m29059A() - 1)));
                                            map3 = map3;
                                        }
                                    }
                                }
                                Map map5 = map3;
                                if (c5302b52 != null) {
                                    int i14 = 0;
                                    while (i14 < c5302b52.m28939D() * 64) {
                                        if (C6077n9.m31153L(c5302b52.m28943L(), i14)) {
                                            str7 = str13;
                                            this.f34158a.mo31033c().m31201u().m31110c("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue2), Integer.valueOf(i14));
                                            bitSet2.set(i14);
                                            if (C6077n9.m31153L(c5302b52.m28941I(), i14)) {
                                                bitSet.set(i14);
                                                i14++;
                                                str13 = str7;
                                            }
                                        } else {
                                            str7 = str13;
                                        }
                                        c30239a6.remove(Integer.valueOf(i14));
                                        i14++;
                                        str13 = str7;
                                    }
                                }
                                String str22 = str13;
                                Integer valueOf4 = Integer.valueOf(intValue2);
                                C5302b5 c5302b53 = (C5302b5) map2.get(valueOf4);
                                if (m30913B2 && m30913B && (list3 = (List) map.get(valueOf4)) != null && this.f33781h != null && this.f33780g != null) {
                                    for (C5300b3 c5300b32 : list3) {
                                        int m28910B = c5300b32.m28910B();
                                        long longValue = this.f33781h.longValue() / 1000;
                                        if (c5300b32.m28916M()) {
                                            longValue = this.f33780g.longValue() / 1000;
                                        }
                                        Integer valueOf5 = Integer.valueOf(m28910B);
                                        if (c30239a6.containsKey(valueOf5)) {
                                            c30239a6.put(valueOf5, Long.valueOf(longValue));
                                        }
                                        if (c30239a7.containsKey(valueOf5)) {
                                            c30239a7.put(valueOf5, Long.valueOf(longValue));
                                        }
                                    }
                                }
                                this.f33779f.put(Integer.valueOf(intValue2), new C6198y9(this, this.f33777d, c5302b53, bitSet, bitSet2, c30239a6, c30239a7, null));
                                str13 = str22;
                                map = map;
                                map3 = map5;
                                map2 = map2;
                            }
                            str4 = str13;
                            str5 = str2;
                            str6 = str3;
                        }
                        if (!list.isEmpty()) {
                            C6209z9 c6209z92 = new C6209z9(this, null);
                            C30239a c30239a8 = new C30239a();
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                C5471l4 c5471l4 = (C5471l4) it10.next();
                                C5471l4 m31507a = c6209z92.m31507a(this.f33777d, c5471l4);
                                if (m31507a != null) {
                                    C6034k m31074W5 = this.f34628b.m31074W();
                                    String str23 = this.f33777d;
                                    String m29398H = m31507a.m29398H();
                                    C6100q m30994V = m31074W5.m30994V(str23, c5471l4.m29398H());
                                    if (m30994V == null) {
                                        m31074W5.f34158a.mo31033c().m31202w().m31110c("Event aggregate wasn't created during raw event logging. appId, event", C6082o3.m31193z(str23), m31074W5.f34158a.m31372D().m30964d(m29398H));
                                        c6100q = new C6100q(str23, c5471l4.m29398H(), 1L, 1L, 1L, c5471l4.m29396D(), 0L, null, null, null, null);
                                    } else {
                                        c6100q = new C6100q(m30994V.f34343a, m30994V.f34344b, m30994V.f34345c + 1, m30994V.f34346d + 1, m30994V.f34347e + 1, m30994V.f34348f, m30994V.f34349g, m30994V.f34350h, m30994V.f34351i, m30994V.f34352j, m30994V.f34353k);
                                    }
                                    this.f34628b.m31074W().m31010p(c6100q);
                                    long j11 = c6100q.f34345c;
                                    String m29398H2 = m31507a.m29398H();
                                    Map map6 = (Map) c30239a8.get(m29398H2);
                                    if (map6 == null) {
                                        C6034k m31074W6 = this.f34628b.m31074W();
                                        String str24 = this.f33777d;
                                        m31074W6.m31504h();
                                        m31074W6.mo31036g();
                                        AbstractC4205o.m19718g(str24);
                                        AbstractC4205o.m19718g(m29398H2);
                                        c6209z9 = c6209z92;
                                        C30239a c30239a9 = new C30239a();
                                        SQLiteDatabase m30988P2 = m31074W6.m30988P();
                                        it2 = it10;
                                        try {
                                            try {
                                                strArr = new String[2];
                                                str10 = str5;
                                            } catch (SQLiteException e19) {
                                                e = e19;
                                            }
                                            try {
                                                strArr[0] = str10;
                                                strArr[1] = "data";
                                                str9 = str11;
                                            } catch (SQLiteException e21) {
                                                e = e21;
                                                str5 = str10;
                                                c6100q2 = c6100q;
                                                str9 = str11;
                                                cursor4 = null;
                                                try {
                                                    m31074W6.f34158a.mo31033c().m31197q().m31110c(str6, C6082o3.m31193z(str24), e);
                                                    map6 = Collections.emptyMap();
                                                    if (cursor4 != null) {
                                                    }
                                                    c30239a8.put(m29398H2, map6);
                                                    it3 = map6.keySet().iterator();
                                                    while (it3.hasNext()) {
                                                    }
                                                    c6209z92 = c6209z9;
                                                    it10 = it2;
                                                    str11 = str9;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    if (cursor4 != null) {
                                                        cursor4.close();
                                                    }
                                                    throw th;
                                                }
                                            }
                                            try {
                                                query = m30988P2.query("event_filters", strArr, "app_id=? AND event_name=?", new String[]{str24, m29398H2}, null, null, null);
                                            } catch (SQLiteException e22) {
                                                e = e22;
                                                str5 = str10;
                                                c6100q2 = c6100q;
                                                cursor4 = null;
                                                m31074W6.f34158a.mo31033c().m31197q().m31110c(str6, C6082o3.m31193z(str24), e);
                                                map6 = Collections.emptyMap();
                                                if (cursor4 != null) {
                                                }
                                                c30239a8.put(m29398H2, map6);
                                                it3 = map6.keySet().iterator();
                                                while (it3.hasNext()) {
                                                }
                                                c6209z92 = c6209z9;
                                                it10 = it2;
                                                str11 = str9;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            cursor4 = null;
                                        }
                                        try {
                                            try {
                                                if (query.moveToFirst()) {
                                                    str5 = str10;
                                                    while (true) {
                                                        try {
                                                            try {
                                                                C5300b3 c5300b33 = (C5300b3) ((C5283a3) C6077n9.m31151C(C5300b3.m28905C(), query.getBlob(1))).m29557k();
                                                                Integer valueOf6 = Integer.valueOf(query.getInt(0));
                                                                List list9 = (List) c30239a9.get(valueOf6);
                                                                if (list9 == null) {
                                                                    c6100q2 = c6100q;
                                                                    try {
                                                                        list4 = new ArrayList();
                                                                        c30239a9.put(valueOf6, list4);
                                                                    } catch (SQLiteException e23) {
                                                                        e = e23;
                                                                        cursor4 = query;
                                                                        m31074W6.f34158a.mo31033c().m31197q().m31110c(str6, C6082o3.m31193z(str24), e);
                                                                        map6 = Collections.emptyMap();
                                                                        if (cursor4 != null) {
                                                                            cursor4.close();
                                                                        }
                                                                        c30239a8.put(m29398H2, map6);
                                                                        it3 = map6.keySet().iterator();
                                                                        while (it3.hasNext()) {
                                                                        }
                                                                        c6209z92 = c6209z9;
                                                                        it10 = it2;
                                                                        str11 = str9;
                                                                    }
                                                                } else {
                                                                    c6100q2 = c6100q;
                                                                    list4 = list9;
                                                                }
                                                                list4.add(c5300b33);
                                                            } catch (IOException e24) {
                                                                c6100q2 = c6100q;
                                                                m31074W6.f34158a.mo31033c().m31197q().m31110c(str4, C6082o3.m31193z(str24), e24);
                                                            }
                                                            if (!query.moveToNext()) {
                                                                break;
                                                            }
                                                            c6100q = c6100q2;
                                                        } catch (SQLiteException e25) {
                                                            e = e25;
                                                            c6100q2 = c6100q;
                                                            cursor4 = query;
                                                            m31074W6.f34158a.mo31033c().m31197q().m31110c(str6, C6082o3.m31193z(str24), e);
                                                            map6 = Collections.emptyMap();
                                                            if (cursor4 != null) {
                                                            }
                                                            c30239a8.put(m29398H2, map6);
                                                            it3 = map6.keySet().iterator();
                                                            while (it3.hasNext()) {
                                                            }
                                                            c6209z92 = c6209z9;
                                                            it10 = it2;
                                                            str11 = str9;
                                                        }
                                                    }
                                                    query.close();
                                                    map6 = c30239a9;
                                                } else {
                                                    str5 = str10;
                                                    c6100q2 = c6100q;
                                                    map6 = Collections.emptyMap();
                                                    query.close();
                                                }
                                            } catch (SQLiteException e26) {
                                                e = e26;
                                                str5 = str10;
                                            }
                                            c30239a8.put(m29398H2, map6);
                                        } catch (Throwable th7) {
                                            th = th7;
                                            cursor4 = query;
                                            if (cursor4 != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        c6209z9 = c6209z92;
                                        it2 = it10;
                                        c6100q2 = c6100q;
                                        str9 = str11;
                                    }
                                    it3 = map6.keySet().iterator();
                                    while (it3.hasNext()) {
                                        int intValue3 = ((Integer) it3.next()).intValue();
                                        Set set = this.f33778e;
                                        Integer valueOf7 = Integer.valueOf(intValue3);
                                        if (set.contains(valueOf7)) {
                                            this.f34158a.mo31033c().m31201u().m31109b("Skipping failed audience ID", valueOf7);
                                        } else {
                                            Iterator it11 = ((List) map6.get(valueOf7)).iterator();
                                            boolean z12 = true;
                                            while (true) {
                                                if (!it11.hasNext()) {
                                                    break;
                                                }
                                                C5300b3 c5300b34 = (C5300b3) it11.next();
                                                C5932aa c5932aa = new C5932aa(this, this.f33777d, intValue3, c5300b34);
                                                z12 = c5932aa.m30798k(this.f33780g, this.f33781h, m31507a, j11, c6100q2, m30800n(intValue3, c5300b34.m28910B()));
                                                if (z12) {
                                                    m30799m(Integer.valueOf(intValue3)).m31501c(c5932aa);
                                                } else {
                                                    this.f33778e.add(Integer.valueOf(intValue3));
                                                    break;
                                                }
                                            }
                                            if (!z12) {
                                                this.f33778e.add(Integer.valueOf(intValue3));
                                            }
                                        }
                                    }
                                    c6209z92 = c6209z9;
                                    it10 = it2;
                                    str11 = str9;
                                }
                            }
                        }
                        String str182 = str11;
                        if (!list2.isEmpty()) {
                            C30239a c30239a10 = new C30239a();
                            Iterator it12 = list2.iterator();
                            while (it12.hasNext()) {
                                C5370f5 c5370f5 = (C5370f5) it12.next();
                                String m29129F = c5370f5.m29129F();
                                Map map7 = (Map) c30239a10.get(m29129F);
                                if (map7 == null) {
                                    C6034k m31074W7 = this.f34628b.m31074W();
                                    String str25 = this.f33777d;
                                    m31074W7.m31504h();
                                    m31074W7.mo31036g();
                                    AbstractC4205o.m19718g(str25);
                                    AbstractC4205o.m19718g(m29129F);
                                    C30239a c30239a11 = new C30239a();
                                    try {
                                        cursor6 = m31074W7.m30988P().query("property_filters", new String[]{str5, "data"}, "app_id=? AND property_name=?", new String[]{str25, m29129F}, null, null, null);
                                    } catch (SQLiteException e27) {
                                        e = e27;
                                        cursor6 = null;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        cursor5 = null;
                                    }
                                    try {
                                        try {
                                        } catch (SQLiteException e28) {
                                            e = e28;
                                        }
                                        if (!cursor6.moveToFirst()) {
                                            map7 = Collections.emptyMap();
                                            cursor6.close();
                                            c30239a10.put(m29129F, map7);
                                        }
                                        do {
                                            try {
                                                C5453k3 c5453k32 = (C5453k3) ((C5436j3) C6077n9.m31151C(C5453k3.m29331C(), cursor6.getBlob(1))).m29557k();
                                                try {
                                                    Integer valueOf8 = Integer.valueOf(cursor6.getInt(0));
                                                    List list10 = (List) c30239a11.get(valueOf8);
                                                    if (list10 == null) {
                                                        list10 = new ArrayList();
                                                        c30239a11.put(valueOf8, list10);
                                                    }
                                                    list10.add(c5453k32);
                                                } catch (SQLiteException e29) {
                                                    e = e29;
                                                    m31074W7.f34158a.mo31033c().m31197q().m31110c(str6, C6082o3.m31193z(str25), e);
                                                    map7 = Collections.emptyMap();
                                                }
                                            } catch (IOException e31) {
                                                m31074W7.f34158a.mo31033c().m31197q().m31110c("Failed to merge filter", C6082o3.m31193z(str25), e31);
                                            }
                                        } while (cursor6.moveToNext());
                                        cursor6.close();
                                        map7 = c30239a11;
                                        c30239a10.put(m29129F, map7);
                                    } catch (Throwable th9) {
                                        th = th9;
                                        cursor5 = cursor6;
                                        if (cursor5 != null) {
                                            cursor5.close();
                                        }
                                        throw th;
                                    }
                                }
                                Iterator it13 = map7.keySet().iterator();
                                while (true) {
                                    if (it13.hasNext()) {
                                        int intValue4 = ((Integer) it13.next()).intValue();
                                        Set set2 = this.f33778e;
                                        Integer valueOf9 = Integer.valueOf(intValue4);
                                        if (set2.contains(valueOf9)) {
                                            this.f34158a.mo31033c().m31201u().m31109b("Skipping failed audience ID", valueOf9);
                                            break;
                                        }
                                        Iterator it14 = ((List) map7.get(valueOf9)).iterator();
                                        boolean z13 = true;
                                        while (true) {
                                            if (!it14.hasNext()) {
                                                break;
                                            }
                                            c5453k3 = (C5453k3) it14.next();
                                            if (Log.isLoggable(this.f34158a.mo31033c().m31194D(), 2)) {
                                                this.f34158a.mo31033c().m31201u().m31111d("Evaluating filter. audience, filter, property", Integer.valueOf(intValue4), c5453k3.m29340J() ? Integer.valueOf(c5453k3.m29334A()) : null, this.f34158a.m31372D().m30966f(c5453k3.m29336E()));
                                                this.f34158a.mo31033c().m31201u().m31109b("Filter definition", this.f34628b.m31085g0().m31171F(c5453k3));
                                            }
                                            if (!c5453k3.m29340J() || c5453k3.m29334A() > 256) {
                                                break;
                                            }
                                            C5956ca c5956ca = new C5956ca(this, this.f33777d, intValue4, c5453k3);
                                            z13 = c5956ca.m30826k(this.f33780g, this.f33781h, c5370f5, m30800n(intValue4, c5453k3.m29334A()));
                                            if (z13) {
                                                m30799m(Integer.valueOf(intValue4)).m31501c(c5956ca);
                                            } else {
                                                this.f33778e.add(Integer.valueOf(intValue4));
                                                break;
                                            }
                                        }
                                        this.f34158a.mo31033c().m31202w().m31110c("Invalid property filter ID. appId, id", C6082o3.m31193z(this.f33777d), String.valueOf(c5453k3.m29340J() ? Integer.valueOf(c5453k3.m29334A()) : null));
                                        this.f33778e.add(Integer.valueOf(intValue4));
                                    }
                                }
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Set keySet2 = this.f33779f.keySet();
                        keySet2.removeAll(this.f33778e);
                        it4 = keySet2.iterator();
                        while (it4.hasNext()) {
                            int intValue5 = ((Integer) it4.next()).intValue();
                            Map map8 = this.f33779f;
                            Integer valueOf10 = Integer.valueOf(intValue5);
                            C6198y9 c6198y9 = (C6198y9) map8.get(valueOf10);
                            AbstractC4205o.m19722k(c6198y9);
                            C5403h4 m31500a = c6198y9.m31500a(intValue5);
                            arrayList4.add(m31500a);
                            C6034k m31074W8 = this.f34628b.m31074W();
                            String str26 = this.f33777d;
                            C5302b5 m29175D = m31500a.m29175D();
                            m31074W8.m31504h();
                            m31074W8.mo31036g();
                            AbstractC4205o.m19718g(str26);
                            AbstractC4205o.m19722k(m29175D);
                            byte[] m29188f = m29175D.m29188f();
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("app_id", str26);
                            String str27 = str5;
                            contentValues2.put(str27, valueOf10);
                            String str28 = str182;
                            contentValues2.put(str28, m29188f);
                            try {
                                try {
                                    if (m31074W8.m30988P().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                        m31074W8.f34158a.mo31033c().m31197q().m31109b("Failed to insert filter results (got -1). appId", C6082o3.m31193z(str26));
                                    }
                                } catch (SQLiteException e32) {
                                    e = e32;
                                    m31074W8.f34158a.mo31033c().m31197q().m31110c("Error storing filter results. appId", C6082o3.m31193z(str26), e);
                                    str182 = str28;
                                    str5 = str27;
                                }
                            } catch (SQLiteException e33) {
                                e = e33;
                            }
                            str182 = str28;
                            str5 = str27;
                        }
                        return arrayList4;
                    }
                    emptyMap = Collections.emptyMap();
                    cursor8.close();
                } catch (Throwable th10) {
                    th = th10;
                    cursor7 = cursor;
                    if (cursor7 != null) {
                        cursor7.close();
                    }
                    throw th;
                }
            }
            if (cursor2.moveToFirst()) {
            }
            if (map2.isEmpty()) {
            }
            if (!list.isEmpty()) {
            }
            String str1822 = str11;
            if (!list2.isEmpty()) {
            }
            ArrayList arrayList42 = new ArrayList();
            Set keySet22 = this.f33779f.keySet();
            keySet22.removeAll(this.f33778e);
            it4 = keySet22.iterator();
            while (it4.hasNext()) {
            }
            return arrayList42;
        } catch (Throwable th11) {
            th = th11;
            Cursor cursor9 = cursor2;
            if (cursor9 != null) {
                cursor9.close();
            }
            throw th;
        }
        map = emptyMap;
        C6034k m31074W32 = this.f34628b.m31074W();
        String str172 = this.f33777d;
        m31074W32.m31504h();
        m31074W32.mo31036g();
        AbstractC4205o.m19718g(str172);
        cursor2 = m31074W32.m30988P().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str172}, null, null, null);
    }
}
