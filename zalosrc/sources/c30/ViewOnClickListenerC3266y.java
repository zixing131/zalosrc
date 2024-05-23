package c30;

import ae.C0766k;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c30.ViewOnClickListenerC3266y;
import com.androidquery.util.AbstractC3987t;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7110j8;
import com.zing.zalo.adapters.C7157o0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17526e;
import gg0.AbstractC19444a;
import gn.C19515b;
import gn.C19516c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import hu.C20131e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;
import p268ji.C21270p;
import p268ji.C21272r;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p363nh.C23744a;
import p471r3.C25630b;
import p588vw.C28644j;
import p693yu.InterfaceC31084b;
import p716zh.C31933ga;
import vg.C28020b3;
import z90.InterfaceC31726a;

/* renamed from: c30.y */
/* loaded from: classes5.dex */
public class ViewOnClickListenerC3266y extends KeyEventCallbackC17462c implements View.OnClickListener, C28644j.o {

    /* renamed from: I */
    private final Context f14000I;

    /* renamed from: J */
    private RecyclerView f14001J;

    /* renamed from: K */
    private ProgressBar f14002K;

    /* renamed from: L */
    private ImageView f14003L;

    /* renamed from: M */
    private TextView f14004M;

    /* renamed from: N */
    private TextView f14005N;

    /* renamed from: O */
    private View f14006O;

    /* renamed from: P */
    private TextView f14007P;

    /* renamed from: Q */
    private View f14008Q;

    /* renamed from: R */
    private C3245i f14009R;

    /* renamed from: S */
    private ArrayList f14010S;

    /* renamed from: T */
    private final C23528a f14011T;

    /* renamed from: U */
    private final String f14012U;

    /* renamed from: V */
    private C7110j8 f14013V;

    /* renamed from: W */
    private final InterfaceC31084b.a f14014W;

    /* renamed from: X */
    private final int f14015X;

    /* renamed from: Y */
    private boolean f14016Y;

    /* renamed from: Z */
    private String f14017Z;

    /* renamed from: a0 */
    private e f14018a0;

    /* renamed from: c30.y$a */
    /* loaded from: classes5.dex */
    class a extends RecyclerView.AbstractC1892s {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            try {
                if (i11 == 0) {
                    ViewOnClickListenerC3266y.this.f14013V.m36239B0(false);
                    ViewOnClickListenerC3266y.this.f14001J.getAdapter().m10008p();
                } else {
                    ViewOnClickListenerC3266y.this.f14013V.m36239B0(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c30.y$b */
    /* loaded from: classes5.dex */
    public class b implements C19516c.c {
        b() {
        }

        @Override // gn.C19516c.c
        /* renamed from: a */
        public void mo2310a(int i11, C20096c c20096c) {
            if (c20096c != null && c20096c.m104491c() == 50001 && ViewOnClickListenerC3266y.this.f14000I != null) {
                ToastUtils.showMess(ViewOnClickListenerC3266y.this.f14000I.getString(AbstractC8020f0.error_message));
            }
            if (ViewOnClickListenerC3266y.this.f14014W != null) {
                ViewOnClickListenerC3266y.this.f14014W.mo62989c(c20096c);
            }
        }

        @Override // gn.C19516c.c
        /* renamed from: b */
        public void mo2311b(int i11, ArrayList arrayList) {
            try {
                C28020b3.f130648a.m141184I(arrayList);
                C31933ga.f146718a.m153476s(ViewOnClickListenerC3266y.this.f14009R.f13854b);
                ((C21272r) C21272r.Companion.m122672a()).m110181j(3);
                if (C28644j.m143233Y().m143312x0(ViewOnClickListenerC3266y.this.f14009R.f13854b)) {
                    C21270p.m110079C().m110152Z(3, 7, "7_1", ViewOnClickListenerC3266y.this.f14009R.f13854b);
                }
                C28644j.m143233Y().m143292X0();
                ToastUtils.m89266n(AbstractC8020f0.str_sticker_downloaded, new Object[0]);
                if (ViewOnClickListenerC3266y.this.f14014W != null) {
                    ViewOnClickListenerC3266y.this.f14014W.mo62988b();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c30.y$c */
    /* loaded from: classes5.dex */
    public class c implements InterfaceC20094a {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m16632e() {
            ViewOnClickListenerC3266y.this.m16625h0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m16633f(int i11) {
            String m118743r0;
            if (i11 == 50001) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
            } else if (i11 == 1001) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_sticker_cate_not_exist);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_general);
            }
            ViewOnClickListenerC3266y.this.m16620Y(m118743r0);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            final int m104491c;
            if (c20096c == null) {
                m104491c = -1;
            } else {
                m104491c = c20096c.m104491c();
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: c30.z
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListenerC3266y.c.this.m16633f(m104491c);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            Runnable runnable;
            try {
                try {
                    ViewOnClickListenerC3266y.this.m16623d0((JSONObject) obj);
                    runnable = new Runnable() { // from class: c30.a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC3266y.c.this.m16632e();
                        }
                    };
                } catch (Exception e11) {
                    e11.printStackTrace();
                    runnable = new Runnable() { // from class: c30.a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC3266y.c.this.m16632e();
                        }
                    };
                }
                AbstractC19444a.m101695c(runnable);
            } catch (Throwable th2) {
                AbstractC19444a.m101695c(new Runnable() { // from class: c30.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC3266y.c.this.m16632e();
                    }
                });
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c30.y$d */
    /* loaded from: classes5.dex */
    public class d implements InterfaceC31726a {

        /* renamed from: a */
        ViewGroup f14022a;

        /* renamed from: b */
        Context f14023b;

        public d(ViewGroup viewGroup, Context context) {
            this.f14022a = viewGroup;
            this.f14023b = context;
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: a */
        public boolean mo16634a() {
            if (ViewOnClickListenerC3266y.this.f14001J.getScrollState() != 0) {
                return true;
            }
            return false;
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: b */
        public void mo16635b(C3251l c3251l, int i11) {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: c */
        public void mo16636c(C3251l c3251l) {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: d */
        public void mo16637d(C3251l c3251l, int i11) {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: e */
        public void mo16638e() {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: f */
        public void mo16639f(StickerView stickerView, int i11) {
            try {
                String emoticon = stickerView.getEmoticon();
                if (!TextUtils.isEmpty(emoticon) && ViewOnClickListenerC3266y.this.f14018a0 != null) {
                    if (C3255n.m16558i() && !ViewOnClickListenerC3266y.this.f14016Y) {
                        return;
                    }
                    ViewOnClickListenerC3266y.this.f14018a0.mo16645b(C28644j.m143233Y().m143290W(emoticon));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: g */
        public void mo16640g(StickerView stickerView, int i11, int i12) {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: h */
        public void mo16641h(String str) {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: i */
        public void mo16642i(C3251l c3251l) {
        }

        @Override // z90.InterfaceC31726a
        /* renamed from: j */
        public void mo16643j() {
        }
    }

    /* renamed from: c30.y$e */
    /* loaded from: classes5.dex */
    public interface e {
        /* renamed from: a */
        void mo16644a();

        /* renamed from: b */
        void mo16645b(C25630b c25630b);
    }

    public ViewOnClickListenerC3266y(Context context, int i11, String str, InterfaceC31084b.a aVar, int i12, String str2) {
        super(context, i11);
        this.f14016Y = false;
        this.f14017Z = "";
        this.f14011T = new C23528a(context);
        C3245i c3245i = new C3245i();
        this.f14009R = c3245i;
        this.f14000I = context;
        this.f14012U = str;
        c3245i.f13854b = Integer.parseInt(str);
        this.f14014W = aVar;
        this.f14015X = i12;
        this.f14017Z = str2;
        m92860d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m16620Y(String str) {
        ToastUtils.showMess(str);
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m16621b0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m16622c0(View view) {
        m16624e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16623d0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("cate");
            JSONArray jSONArray = jSONObject2.getJSONArray("list");
            this.f14009R = new C3245i(jSONObject3);
            this.f14010S = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                C3247j c3247j = new C3247j(jSONArray.getJSONObject(i11));
                C25630b c25630b = new C25630b();
                c25630b.m132405O(c3247j.f13890c);
                c25630b.m132404N(c3247j.f13889b);
                c25630b.m132410T(Integer.parseInt(c3247j.f13892e));
                c25630b.m132406P(c3247j.f13896i);
                c25630b.m132414X(c3247j.f13889b);
                c25630b.m132419b(C28644j.m143232X(), C28644j.m143248i0());
                c25630b.m132407Q(c3247j.f13894g);
                AbstractC3987t.m18881d(c25630b.m132436n(), c25630b);
                if (c25630b.m132399G()) {
                    c25630b.m132411U((C20131e.f99303a.m104942a0() + c25630b.m132432j() + "/") + c25630b.m132429g() + AbstractC17526e.f89367y[c25630b.m132434l()]);
                }
                if (this.f14009R.f13866n == 0) {
                    C28644j.m143233Y().m143297a1(c25630b);
                }
                C3251l c3251l = new C3251l(0);
                c3251l.m16522l(c25630b);
                this.f14010S.add(c3251l);
            }
            C3245i c3245i = this.f14009R;
            if (c3245i != null) {
                Map map = AbstractC23304d.f113461z;
                if (!map.containsKey(Integer.valueOf(c3245i.f13854b))) {
                    map.put(Integer.valueOf(this.f14009R.f13854b), this.f14009R);
                    C3255n.m16562n().m16570E(map);
                }
                ArrayList arrayList = this.f14010S;
                if (arrayList != null && arrayList.size() > 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = this.f14010S.iterator();
                    while (it.hasNext()) {
                        C3251l c3251l2 = (C3251l) it.next();
                        linkedHashMap.put(c3251l2.m16512b(), c3251l2);
                    }
                    C28644j.m143233Y().m143275E(this.f14009R.f13854b, linkedHashMap);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e0 */
    private void m16624e0() {
        try {
            C19515b.m101996i().m102003l(this.f14009R, this.f14015X, 0, 0, new b());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m16625h0() {
        ArrayList arrayList;
        if (this.f14009R != null && (arrayList = this.f14010S) != null && arrayList.size() != 0) {
            this.f14008Q.setVisibility(0);
            this.f14005N.setText(this.f14009R.m16464f());
            if (this.f14009R.f13866n != 0) {
                this.f14006O.setVisibility(8);
                this.f14004M.setVisibility(8);
                this.f14007P.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sticker_popup_cant_download));
                this.f14007P.setVisibility(0);
                C23744a.m124114c().m124116d(4, new Object[0]);
                return;
            }
            this.f14006O.setVisibility(0);
            this.f14004M.setVisibility(0);
            this.f14007P.setVisibility(8);
            C7110j8.d dVar = new C7110j8.d();
            dVar.f38885p = 4;
            dVar.f38886q = AbstractC23136l9.m118742r(68.0f);
            dVar.f38887r = 0;
            dVar.f38888s = 0;
            boolean z11 = true;
            dVar.f38889t = true;
            if (((C3251l) this.f14010S.get(0)).m16514d() == null || !((C3251l) this.f14010S.get(0)).m16514d().m132399G()) {
                z11 = false;
            }
            this.f14016Y = z11;
            C7157o0.f fVar = new C7157o0.f();
            fVar.f39183p = false;
            fVar.f39184q = 38;
            dVar.f38890u = fVar;
            C7110j8 c7110j8 = new C7110j8(this.f14011T, new d(this.f14001J, this.f14000I), null, 0, dVar, 0);
            this.f14013V = c7110j8;
            c7110j8.m36238A0(this.f14017Z);
            this.f14013V.m36246z0(C3255n.m16558i());
            this.f14013V.m36245y0(this.f14009R);
            this.f14001J.setAdapter(this.f14013V);
            this.f14002K.setVisibility(4);
            e eVar = this.f14018a0;
            if (eVar != null) {
                eVar.mo16644a();
                return;
            }
            return;
        }
        m16620Y(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
    }

    /* renamed from: a0 */
    public void m16626a0() {
        C3245i c3245i = this.f14009R;
        if (c3245i != null && c3245i.f13854b > 0) {
            C28644j.m143233Y().m143300e0(new ArrayList(Collections.singleton(Integer.valueOf(this.f14009R.f13854b))), this, this);
        }
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, com.zing.zalo.zview.dialog.InterfaceC17463d
    public void dismiss() {
        super.dismiss();
        C7853b.m40052a0().m40136j1();
        C7853b.m40052a0().m40129g1(null);
    }

    /* renamed from: f0 */
    public void m16627f0() {
        C7110j8 c7110j8 = this.f14013V;
        if (c7110j8 != null) {
            c7110j8.m10008p();
        }
    }

    @Override // p588vw.C28644j.o
    /* renamed from: f1 */
    public void mo16628f1(List list, List list2) {
        int i11;
        int intValue = ((Integer) list.get(0)).intValue();
        LinkedHashMap linkedHashMap = (LinkedHashMap) list2.get(0);
        C3245i c3245i = this.f14009R;
        if (c3245i != null && (i11 = c3245i.f13854b) == intValue) {
            C3245i c3245i2 = (C3245i) AbstractC23304d.f113461z.get(Integer.valueOf(i11));
            if (c3245i2 != null && !TextUtils.isEmpty(c3245i2.m16464f()) && linkedHashMap != null && linkedHashMap.size() > 0) {
                this.f14009R = c3245i2;
                this.f14010S = new ArrayList(linkedHashMap.values());
                AbstractC19444a.m101695c(new Runnable() { // from class: c30.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC3266y.this.m16625h0();
                    }
                });
            } else {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new c());
                c0766k.mo1410D5(this.f14009R.f13854b, 0, this.f14015X, C7960e.m41971c6().m42253R6(CoreUtility.f89233i) + 1);
            }
        }
    }

    /* renamed from: g0 */
    public void m16629g0(e eVar) {
        this.f14018a0 = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.sticker_popup_close_button) {
            dismiss();
        } else if (id2 == AbstractC6918a0.sticker_popup_download_btn) {
            m16624e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        m92870v(1);
        m92850A(AbstractC7409c0.sticker_download_popup);
        this.f14008Q = m92864h(AbstractC6918a0.sticker_popup_layout);
        this.f14001J = (RecyclerView) m92864h(AbstractC6918a0.emoticon_selector_grid);
        this.f14001J.setLayoutManager(new LinearLayoutManager(this.f89004q));
        this.f14001J.m9826E(new a());
        ProgressBar progressBar = (ProgressBar) m92864h(AbstractC6918a0.pbLoading);
        this.f14002K = progressBar;
        progressBar.setVisibility(0);
        ImageView imageView = (ImageView) m92864h(AbstractC6918a0.sticker_popup_close_button);
        this.f14003L = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: c30.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC3266y.this.m16621b0(view);
            }
        });
        TextView textView = (TextView) m92864h(AbstractC6918a0.sticker_popup_download_btn);
        this.f14004M = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: c30.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC3266y.this.m16622c0(view);
            }
        });
        this.f14005N = (TextView) m92864h(AbstractC6918a0.sticker_popup_title);
        this.f14006O = m92864h(AbstractC6918a0.sticker_popup_content);
        this.f14007P = (TextView) m92864h(AbstractC6918a0.sticker_popup_empty_view);
        this.f14008Q.setVisibility(8);
    }
}
