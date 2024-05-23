package p395ok;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dm.C18027a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gm.C19491b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kw.C21956b;
import me0.AbstractC23008a2;
import p365nk.C23805a;
import qm0.AbstractC25370t;

/* renamed from: ok.b */
/* loaded from: classes3.dex */
public final class C24283b implements InterfaceC24282a {
    public static final a Companion = new a(null);

    /* renamed from: ok.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ok.b$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f117270a;

        static {
            int[] iArr = new int[C23805a.d.values().length];
            try {
                iArr[C23805a.d.f115056p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C23805a.d.f115059s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C23805a.d.f115060t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C23805a.d.f115058r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C23805a.d.f115057q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f117270a = iArr;
        }
    }

    @Override // p395ok.InterfaceC24282a
    /* renamed from: a */
    public Map mo126790a() {
        C18027a.b bVar;
        int m95852c;
        String str = "SMLMyCloudLocalDataSource";
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        long m41548n = C7956b.Companion.m41573b().m41548n("204278670");
        hashMap.put("text", 0L);
        hashMap.put("photo", 0L);
        hashMap.put("file", 0L);
        hashMap.put("video", 0L);
        hashMap.put("others", 0L);
        try {
            bVar = C18027a.Companion;
            m95852c = bVar.m95862a().m95852c("204278670", "0", new int[]{4});
        } catch (Exception e11) {
            e = e11;
        }
        try {
            int m95852c2 = bVar.m95862a().m95852c("204278670", "0", new int[]{0});
            int m95852c3 = bVar.m95862a().m95852c("204278670", "0", new int[]{1});
            int m95852c4 = bVar.m95862a().m95852c("204278670", "0", new int[]{2});
            hashMap.put("text", Long.valueOf(m95852c));
            hashMap.put("photo", Long.valueOf(m95852c2));
            hashMap.put("video", Long.valueOf(m95852c3));
            hashMap.put("file", Long.valueOf(m95852c4));
            hashMap.put("others", Long.valueOf(m41548n - (((m95852c + m95852c2) + m95852c3) + m95852c4)));
            str = "SMLMyCloudLocalDataSource";
            C21956b.m114657g(str, "getMyCloudMsgStats(): totalMsgCount=" + m41548n + ", result=" + hashMap + ". Elapsed: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        } catch (Exception e12) {
            e = e12;
            str = "SMLMyCloudLocalDataSource";
            C21956b.m114653c(str, e);
            return hashMap;
        }
        return hashMap;
    }

    @Override // p395ok.InterfaceC24282a
    /* renamed from: b */
    public List mo126791b(String str, C23805a.d dVar, int i11, int i12) {
        ArrayList arrayList;
        int[] iArr;
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(dVar, "modeMessage");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            int i13 = b.f117270a[dVar.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 == 5) {
                                iArr = new int[]{0, 1, 2, 6, 5, 3, 7, 4};
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            iArr = new int[]{4, 3};
                        }
                    } else {
                        iArr = new int[]{3};
                    }
                } else {
                    iArr = new int[]{2};
                }
            } else {
                iArr = new int[]{0, 1};
            }
            int[] iArr2 = iArr;
            C7956b m41573b = C7956b.Companion.m41573b();
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            arrayList = arrayList2;
            try {
                C19491b m41528T = m41573b.m41528T(str2, str, iArr2, "0", Long.MIN_VALUE, Long.MAX_VALUE, 1, i11, i12, zdbApiCode);
                m41528T.m101929d();
                arrayList.addAll(AbstractC23008a2.m117943l(m41528T));
                int i14 = zdbApiCode.error_code;
                if (i14 != 0) {
                    C21956b.m114659i(124640, i14, currentTimeMillis, 0L, 0L, 24, null);
                    C7967l.Companion.m42751f(zdbApiCode, "loadMyCloudQuickMessages->getMediaWithTypeAPI", str, iArr2.toString());
                }
            } catch (Exception e11) {
                e = e11;
                C21956b.m114653c("SMLMyCloudLocalDataSource", e);
                return arrayList;
            }
        } catch (Exception e12) {
            e = e12;
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override // p395ok.InterfaceC24282a
    /* renamed from: c */
    public LinkedHashMap mo126792c(String str, ArrayList arrayList) {
        int m131511r;
        LinkedHashMap linkedHashMap;
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(arrayList, "msgIdList");
        long currentTimeMillis = System.currentTimeMillis();
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C17945a0.w((MessageId) it.next(), 0).m95389y(str).m95365a());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        try {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            for (C17945a0 c17945a0 : C7956b.Companion.m41573b().m41559t(str, arrayList2)) {
                linkedHashMap2.put(Long.valueOf(c17945a0.m95029V3().m41045i()), c17945a0);
            }
            int i11 = zdbApiCode.error_code;
            if (i11 != 0) {
                linkedHashMap = linkedHashMap2;
                try {
                    C21956b.m114659i(124642, i11, currentTimeMillis, 0L, 0L, 24, null);
                    C7967l.Companion.m42751f(zdbApiCode, "findMessages", str, String.valueOf(arrayList.size()));
                } catch (Exception e11) {
                    e = e11;
                    C21956b.m114653c("SMLMyCloudLocalDataSource", e);
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    int size = linkedHashMap.size();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("findMessages(): conversationId=");
                    sb2.append(str);
                    sb2.append(". Result size: ");
                    sb2.append(size);
                    sb2.append(". Elapsed: ");
                    sb2.append(currentTimeMillis2);
                    sb2.append(" ms");
                    return linkedHashMap;
                }
            } else {
                linkedHashMap = linkedHashMap2;
            }
        } catch (Exception e12) {
            e = e12;
            linkedHashMap = linkedHashMap2;
        }
        long currentTimeMillis22 = System.currentTimeMillis() - currentTimeMillis;
        int size2 = linkedHashMap.size();
        StringBuilder sb22 = new StringBuilder();
        sb22.append("findMessages(): conversationId=");
        sb22.append(str);
        sb22.append(". Result size: ");
        sb22.append(size2);
        sb22.append(". Elapsed: ");
        sb22.append(currentTimeMillis22);
        sb22.append(" ms");
        return linkedHashMap;
    }
}
