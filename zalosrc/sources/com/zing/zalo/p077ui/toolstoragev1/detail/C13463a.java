package com.zing.zalo.p077ui.toolstoragev1.detail;

import android.os.Bundle;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import p205hc.InterfaceC19969h;
import qm0.AbstractC25370t;

/* renamed from: com.zing.zalo.ui.toolstoragev1.detail.a */
/* loaded from: classes6.dex */
public final class C13463a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f68920a;

    /* renamed from: b */
    private long f68921b;

    /* renamed from: c */
    public ThreadStorageInfo f68922c;

    /* renamed from: d */
    public String f68923d;

    /* renamed from: e */
    private String f68924e;

    /* renamed from: f */
    private boolean f68925f;

    /* renamed from: g */
    private ToolStorageDetailPage.EnumC13333a f68926g;

    /* renamed from: h */
    private ArrayList f68927h;

    /* renamed from: com.zing.zalo.ui.toolstoragev1.detail.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C13463a m75485a(Bundle bundle) {
            ArrayList arrayList;
            int m131511r;
            C13463a c13463a = new C13463a(0L, 0L, 3, null);
            if (bundle == null) {
                return c13463a;
            }
            ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) bundle.getParcelable("details");
            if (threadStorageInfo == null) {
                c13463a.f68923d = bundle.getString("extra_conversation_id");
            }
            c13463a.f68922c = threadStorageInfo;
            c13463a.m75483k(bundle.getLong("size_conversation", 0L));
            c13463a.m75482j(bundle.getLong("size_cache", 0L));
            String string = bundle.getString("STR_SOURCE_START_VIEW", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            c13463a.m75484l(string);
            c13463a.m75480h(bundle.getBoolean("is_big_file_flow", false));
            ToolStorageDetailPage.EnumC13333a.a aVar = ToolStorageDetailPage.EnumC13333a.Companion;
            String string2 = bundle.getString("access_flow", ToolStorageDetailPage.EnumC13333a.f68483q.m74885c());
            AbstractC19074t.m100207e(string2, "getString(...)");
            c13463a.m75479g(aVar.m74886a(string2));
            ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList("thread_ids_list");
            if (charSequenceArrayList != null) {
                AbstractC19074t.m100205c(charSequenceArrayList);
                m131511r = AbstractC25370t.m131511r(charSequenceArrayList, 10);
                ArrayList arrayList2 = new ArrayList(m131511r);
                Iterator<T> it = charSequenceArrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CharSequence) it.next()).toString());
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            c13463a.m75481i(arrayList);
            return c13463a;
        }
    }

    public C13463a(long j11, long j12) {
        this.f68920a = j11;
        this.f68921b = j12;
        this.f68924e = "";
        this.f68926g = ToolStorageDetailPage.EnumC13333a.f68483q;
        this.f68927h = new ArrayList();
    }

    /* renamed from: a */
    public final ToolStorageDetailPage.EnumC13333a m75473a() {
        return this.f68926g;
    }

    /* renamed from: b */
    public final ArrayList m75474b() {
        return this.f68927h;
    }

    /* renamed from: c */
    public final long m75475c() {
        return this.f68921b;
    }

    /* renamed from: d */
    public final long m75476d() {
        return this.f68920a;
    }

    /* renamed from: e */
    public final String m75477e() {
        return this.f68924e;
    }

    /* renamed from: f */
    public final boolean m75478f() {
        return this.f68925f;
    }

    /* renamed from: g */
    public final void m75479g(ToolStorageDetailPage.EnumC13333a enumC13333a) {
        AbstractC19074t.m100208f(enumC13333a, "<set-?>");
        this.f68926g = enumC13333a;
    }

    /* renamed from: h */
    public final void m75480h(boolean z11) {
        this.f68925f = z11;
    }

    /* renamed from: i */
    public final void m75481i(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "<set-?>");
        this.f68927h = arrayList;
    }

    /* renamed from: j */
    public final void m75482j(long j11) {
        this.f68921b = j11;
    }

    /* renamed from: k */
    public final void m75483k(long j11) {
        this.f68920a = j11;
    }

    /* renamed from: l */
    public final void m75484l(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f68924e = str;
    }

    public /* synthetic */ C13463a(long j11, long j12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? 0L : j12);
    }
}
