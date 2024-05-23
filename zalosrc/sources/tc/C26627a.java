package tc;

import am.C0943w;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import fn0.AbstractC19074t;
import gm.C19490a;
import gm.C19491b;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import p128ed.C18388c;
import p128ed.C18390e;
import p304ks.AbstractC21935u;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import p716zh.C31986k3;
import sc.C26220b;
import sg0.C26245a;
import vi.C28262h;

/* renamed from: tc.a */
/* loaded from: classes3.dex */
public final class C26627a {

    /* renamed from: a */
    public static final C26627a f126082a = new C26627a();

    private C26627a() {
    }

    /* renamed from: a */
    private final ArrayList m136726a(String str, C19491b c19491b, HashMap hashMap, HashMap hashMap2, long j11, HashSet hashSet) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int m101929d = c19491b.m101929d();
        for (int i11 = 0; i11 < m101929d; i11++) {
            C19490a m101928c = c19491b.m101928c(i11);
            if (m101928c != null) {
                String m97405i = C18390e.m97405i(String.valueOf(m101928c.f96740z), str, String.valueOf(m101928c.f96718d), String.valueOf(m101928c.f96723i));
                if (!hashSet.contains(m97405i)) {
                    hashSet.add(m97405i);
                    C19490a.b bVar = m101928c.f96735u;
                    String str3 = "";
                    if (bVar == null) {
                        str2 = "";
                    } else {
                        str2 = AbstractC19646n0.m103034u0(bVar.f96753a, m101928c.f96720f);
                    }
                    C18388c c18388c = C18388c.f92779a;
                    AbstractC19074t.m100205c(str2);
                    if (c18388c.m97398i(str2)) {
                        C28262h c28262h = (C28262h) hashMap2.get(m97405i);
                        if (c28262h == null) {
                            c28262h = null;
                        }
                        C28262h c28262h2 = c28262h;
                        if (c28262h != null) {
                            if (c28262h2 != null) {
                                c28262h2.m142278r(str2);
                            }
                        } else {
                            if ((!hashMap.isEmpty()) && j11 > 0 && m101928c.f96725k <= j11) {
                                C18390e c18390e = C18390e.f92781a;
                                String m97422n = c18390e.m97422n(m101928c.f96732r);
                                if (m97422n.length() > 0) {
                                    str3 = c18390e.m97425v(m97422n);
                                }
                                if (str3.length() > 0) {
                                    if (hashMap.containsKey(str3)) {
                                    }
                                    arrayList.add(C28262h.Companion.m142331c(str2, m101928c.f96725k, "", str, String.valueOf(m101928c.f96718d), MessageId.Companion.m41063a(m101928c.f96723i, m101928c.f96721g, str, String.valueOf(m101928c.f96718d))));
                                }
                            }
                            arrayList.add(C28262h.Companion.m142331c(str2, m101928c.f96725k, "", str, String.valueOf(m101928c.f96718d), MessageId.Companion.m41063a(m101928c.f96723i, m101928c.f96721g, str, String.valueOf(m101928c.f96718d))));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final boolean m136727b(String str, boolean z11, int i11, boolean z12) {
        C31973j5 m4472f;
        AbstractC19074t.m100208f(str, "uid");
        if (AbstractC25495a.m132082g(str)) {
            C26220b.m134828k("isValidBackupMediaConversation(" + str + "): Exclude ROOM");
            return false;
        }
        if (!AbstractC25495a.m132079d(str) && AbstractC21935u.m114518H(str)) {
            C26220b.m134828k("isValidBackupMediaConversation(" + str + "): Exclude OA");
            return false;
        }
        if (AbstractC25495a.m132078c(str)) {
            return false;
        }
        if (!z11 && AbstractC25495a.m132079d(str)) {
            return false;
        }
        if (AbstractC25495a.m132079d(str) && ((m4472f = C0943w.f3447a.m4472f(str)) == null || m4472f.m153732O() > i11)) {
            C26220b.m134828k("isValidBackupMediaConversation(" + str + "): Exclude big group / community");
            return false;
        }
        if (!z12 && C31986k3.f147083a.m154105P1(str)) {
            C26220b.m134828k("isValidBackupMediaConversation(" + str + "): Exclude backup E2EE");
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String m136728c(String str) {
        AbstractC19074t.m100208f(str, "rawData");
        return "vtnkh" + C26245a.f124654a.m134954m(str);
    }

    /* renamed from: d */
    public final long m136729d(String str, ArrayList arrayList, HashSet hashSet, HashMap hashMap, HashMap hashMap2, long j11, long j12, long j13, int i11) {
        long j14;
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(arrayList, "listFileMDUploadConversation");
        AbstractC19074t.m100208f(hashSet, "setIdChatMsgConversation");
        AbstractC19074t.m100208f(hashMap, "mapDriveFileMDInSingle");
        AbstractC19074t.m100208f(hashMap2, "mapDriveFileMDInZip");
        try {
            C19491b m41481P = C7956b.m41481P(C7956b.Companion.m41573b(), str, j12, j13, i11, 0L, 16, null);
            if (m41481P == null || m41481P.m101929d() <= 0) {
                return Long.MIN_VALUE;
            }
            if (m41481P.m101929d() < i11) {
                j14 = Long.MIN_VALUE;
            } else {
                j14 = m41481P.m101928c(m41481P.m101929d() - 1).f96738x;
            }
            if (j14 > Long.MIN_VALUE && m41481P.m101929d() >= i11 && m41481P.m101928c(m41481P.m101929d() - 1).f96738x == m41481P.m101928c(0).f96738x) {
                j14--;
            }
            long j15 = j14;
            arrayList.addAll(m136726a(str, m41481P, hashMap, hashMap2, j11, hashSet));
            return j15;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(new BackupRestoreMediaException(3, 2013, "[Analyze] " + e11));
            return Long.MIN_VALUE;
        }
    }
}
