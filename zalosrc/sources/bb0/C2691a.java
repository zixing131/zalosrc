package bb0;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.adapters.C7035d;
import com.zing.zalo.p077ui.moduleview.storageusage.StorageUsageItemModuleView;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.uidrawing.ModulesView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k30.C21459a;
import mm0.AbstractC23350e;
import p361nb.AbstractC23647d;

/* renamed from: bb0.a */
/* loaded from: classes6.dex */
public class C2691a extends C7035d {

    /* renamed from: A */
    private final HashMap f10743A;

    /* renamed from: B */
    private boolean f10744B;

    /* renamed from: C */
    private long f10745C;

    /* renamed from: D */
    private final c f10746D;

    /* renamed from: z */
    public String f10747z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bb0.a$a */
    /* loaded from: classes6.dex */
    public class a implements c {
        a() {
        }

        @Override // bb0.C2691a.c
        /* renamed from: a */
        public boolean mo13168a(String str) {
            return C2691a.this.m13159q(str);
        }

        @Override // bb0.C2691a.c
        /* renamed from: b */
        public boolean mo13169b() {
            return C2691a.this.f10744B;
        }
    }

    /* renamed from: bb0.a$b */
    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a */
        private StorageUsageItemModuleView f10749a;

        public b(View view) {
            this.f10749a = (StorageUsageItemModuleView) view;
        }

        /* renamed from: a */
        void m13170a(ThreadStorageInfo threadStorageInfo, int i11) {
            try {
                this.f10749a.m69956V(threadStorageInfo, i11);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("StorageListAdapter", e11);
            }
        }

        /* renamed from: b */
        public ModulesView m13171b() {
            return this.f10749a;
        }
    }

    /* renamed from: bb0.a$c */
    /* loaded from: classes6.dex */
    public interface c {
        /* renamed from: a */
        boolean mo13168a(String str);

        /* renamed from: b */
        boolean mo13169b();
    }

    public C2691a(Context context) {
        super(context, -1);
        this.f10747z = "";
        this.f10743A = new HashMap();
        this.f10744B = false;
        this.f10745C = 0L;
        this.f10746D = new a();
    }

    /* renamed from: q */
    public boolean m13159q(String str) {
        if (this.f10743A.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private void m13160s(ThreadStorageInfo threadStorageInfo) {
        ThreadStorageInfo threadStorageInfo2 = (ThreadStorageInfo) this.f10743A.get(threadStorageInfo.m74822z());
        if (threadStorageInfo2 == null) {
            return;
        }
        this.f10745C -= threadStorageInfo2.m74777O();
        this.f10743A.put(threadStorageInfo.m74822z(), threadStorageInfo);
        this.f10745C += threadStorageInfo.m74777O();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        if (((ThreadStorageInfo) getItem(i11)) != null) {
            return 0;
        }
        return 1;
    }

    @Override // com.zing.zalo.adapters.C7035d, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        View view2;
        b bVar;
        ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) getItem(i11);
        if (getItemViewType(i11) == 0) {
            if (view == null) {
                bVar = new b(new StorageUsageItemModuleView(m35954e(), this.f10746D));
                view2 = bVar.m13171b();
                view2.setTag(bVar);
            } else {
                view2 = view;
                bVar = (b) view.getTag();
            }
            bVar.m13170a(threadStorageInfo, i11);
            return view2;
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    /* renamed from: l */
    public void m13161l() {
        try {
            if (m13165p() && !this.f10743A.isEmpty()) {
                HashSet hashSet = new HashSet(this.f10743A.size());
                int count = getCount();
                for (int i11 = 0; i11 < count; i11++) {
                    ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) getItem(i11);
                    if (threadStorageInfo != null && m13159q(threadStorageInfo.m74822z())) {
                        hashSet.add(threadStorageInfo.m74822z());
                        m13160s(threadStorageInfo);
                    }
                }
                Iterator it = this.f10743A.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains((String) entry.getKey())) {
                        ThreadStorageInfo threadStorageInfo2 = (ThreadStorageInfo) entry.getValue();
                        if (threadStorageInfo2 != null) {
                            this.f10745C -= threadStorageInfo2.m74777O();
                        }
                        it.remove();
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("StorageListAdapter", e11);
        }
    }

    /* renamed from: m */
    public String m13162m() {
        return C21459a.m111036d(this.f10745C);
    }

    /* renamed from: n */
    public List m13163n() {
        if (this.f10743A.isEmpty()) {
            return new ArrayList();
        }
        return new ArrayList(this.f10743A.values());
    }

    /* renamed from: o */
    public int m13164o() {
        return this.f10743A.size();
    }

    /* renamed from: p */
    public boolean m13165p() {
        return this.f10744B;
    }

    /* renamed from: r */
    public void m13166r(boolean z11) {
        this.f10744B = z11;
        if (!z11) {
            this.f10745C = 0L;
            this.f10743A.clear();
        }
        notifyDataSetChanged();
    }

    /* renamed from: t */
    public boolean m13167t(int i11) {
        try {
            ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) getItem(i11);
            if (threadStorageInfo != null && !TextUtils.isEmpty(threadStorageInfo.m74822z())) {
                String m74822z = threadStorageInfo.m74822z();
                if (m13159q(m74822z)) {
                    ThreadStorageInfo threadStorageInfo2 = (ThreadStorageInfo) this.f10743A.remove(m74822z);
                    if (threadStorageInfo2 != null) {
                        threadStorageInfo = threadStorageInfo2;
                    }
                    this.f10745C -= threadStorageInfo.m74777O();
                    AbstractC23647d.m123897g("711238");
                } else {
                    this.f10743A.put(m74822z, threadStorageInfo);
                    this.f10745C += threadStorageInfo.m74777O();
                    AbstractC23647d.m123897g("711237");
                }
                notifyDataSetChanged();
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("StorageListAdapter", e11);
            return false;
        }
    }
}
