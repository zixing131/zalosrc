package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5454k4;
import com.google.android.gms.internal.measurement.C5471l4;
import com.google.android.gms.internal.measurement.C5539p4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p230i6.AbstractC20312d0;

/* renamed from: com.google.android.gms.measurement.internal.z9 */
/* loaded from: classes.dex */
public final class C6209z9 {

    /* renamed from: a */
    private C5471l4 f34660a;

    /* renamed from: b */
    private Long f34661b;

    /* renamed from: c */
    private long f34662c;

    /* renamed from: d */
    final /* synthetic */ C5933b f34663d;

    public /* synthetic */ C6209z9(C5933b c5933b, AbstractC20312d0 abstractC20312d0) {
        this.f34663d = c5933b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0101, code lost:            if (r12 == null) goto L116;     */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00e7: MOVE (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:232), block:B:69:0x00e7 */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5471l4 m31507a(String str, C5471l4 c5471l4) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Pair pair;
        Object obj;
        String m29398H = c5471l4.m29398H();
        List m29399I = c5471l4.m29399I();
        this.f34663d.f34628b.m31085g0();
        Long l11 = (Long) C6077n9.m31158n(c5471l4, "_eid");
        if (l11 != null) {
            if (m29398H.equals("_ep")) {
                AbstractC4205o.m19722k(l11);
                this.f34663d.f34628b.m31085g0();
                String str2 = (String) C6077n9.m31158n(c5471l4, "_en");
                if (TextUtils.isEmpty(str2)) {
                    this.f34663d.f34158a.mo31033c().m31199s().m31109b("Extra parameter without an event name. eventId", l11);
                    return null;
                }
                if (this.f34660a == null || this.f34661b == null || l11.longValue() != this.f34661b.longValue()) {
                    C6034k m31074W = this.f34663d.f34628b.m31074W();
                    m31074W.mo31036g();
                    m31074W.m31504h();
                    try {
                        try {
                            cursor2 = m31074W.m30988P().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l11.toString()});
                        } catch (SQLiteException e11) {
                            e = e11;
                            cursor2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = null;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                        try {
                        } catch (SQLiteException e12) {
                            e = e12;
                            m31074W.f34158a.mo31033c().m31197q().m31109b("Error selecting main event", e);
                        }
                        if (!cursor2.moveToFirst()) {
                            m31074W.f34158a.mo31033c().m31201u().m31108a("Main event not found");
                        } else {
                            try {
                                pair = Pair.create((C5471l4) ((C5454k4) C6077n9.m31151C(C5471l4.m29382E(), cursor2.getBlob(0))).m29557k(), Long.valueOf(cursor2.getLong(1)));
                                cursor2.close();
                            } catch (IOException e13) {
                                m31074W.f34158a.mo31033c().m31197q().m31111d("Failed to merge main event. appId, eventId", C6082o3.m31193z(str), l11, e13);
                            }
                            if (pair == null && (obj = pair.first) != null) {
                                this.f34660a = (C5471l4) obj;
                                this.f34662c = ((Long) pair.second).longValue();
                                this.f34663d.f34628b.m31085g0();
                                this.f34661b = (Long) C6077n9.m31158n(this.f34660a, "_eid");
                            } else {
                                this.f34663d.f34158a.mo31033c().m31199s().m31110c("Extra parameter without existing main event. eventName, eventId", str2, l11);
                                return null;
                            }
                        }
                        cursor2.close();
                        pair = null;
                        if (pair == null) {
                        }
                        this.f34663d.f34158a.mo31033c().m31199s().m31110c("Extra parameter without existing main event. eventName, eventId", str2, l11);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursor3;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                long j11 = this.f34662c - 1;
                this.f34662c = j11;
                if (j11 <= 0) {
                    C6034k m31074W2 = this.f34663d.f34628b.m31074W();
                    m31074W2.mo31036g();
                    m31074W2.f34158a.mo31033c().m31201u().m31109b("Clearing complex main event info. appId", str);
                    try {
                        m31074W2.m30988P().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e14) {
                        m31074W2.f34158a.mo31033c().m31197q().m31109b("Error clearing complex main event", e14);
                    }
                } else {
                    this.f34663d.f34628b.m31074W().m31015u(str, l11, this.f34662c, this.f34660a);
                }
                ArrayList arrayList = new ArrayList();
                for (C5539p4 c5539p4 : this.f34660a.m29399I()) {
                    this.f34663d.f34628b.m31085g0();
                    if (C6077n9.m31157m(c5471l4, c5539p4.m29518G()) == null) {
                        arrayList.add(c5539p4);
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.addAll(m29399I);
                    m29399I = arrayList;
                } else {
                    this.f34663d.f34158a.mo31033c().m31199s().m31109b("No unique parameters in main event. eventName", str2);
                }
                m29398H = str2;
            } else {
                this.f34661b = l11;
                this.f34660a = c5471l4;
                this.f34663d.f34628b.m31085g0();
                Object obj2 = 0L;
                Object m31158n = C6077n9.m31158n(c5471l4, "_epc");
                if (m31158n != null) {
                    obj2 = m31158n;
                }
                long longValue = ((Long) obj2).longValue();
                this.f34662c = longValue;
                if (longValue <= 0) {
                    this.f34663d.f34158a.mo31033c().m31199s().m31109b("Complex event with zero extra param count. eventName", m29398H);
                } else {
                    this.f34663d.f34628b.m31074W().m31015u(str, (Long) AbstractC4205o.m19722k(l11), this.f34662c, c5471l4);
                }
            }
        }
        C5454k4 c5454k4 = (C5454k4) c5471l4.m29649i();
        c5454k4.m29356x(m29398H);
        c5454k4.m29354v();
        c5454k4.m29351r(m29399I);
        return (C5471l4) c5454k4.m29557k();
    }
}
