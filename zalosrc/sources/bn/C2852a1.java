package bn;

import ag0.AbstractC0826k;
import ag0.C0843s0;
import ag0.C0856z;
import am.C0943w;
import android.R;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.p077ui.moduleview.pin.ConversationPinItemModuleView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gw.C19637j;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p175g0.AbstractC19178a;
import p227i3.C20217u;
import p348mi.AbstractC23309i;
import p716zh.C31931g8;
import p716zh.C31973j5;
import p716zh.C32076q5;
import vg.C28203u6;

/* renamed from: bn.a1 */
/* loaded from: classes3.dex */
public class C2852a1 {

    /* renamed from: d */
    private static WeakReference f11357d;

    /* renamed from: a */
    private final Context f11358a;

    /* renamed from: b */
    private final a f11359b;

    /* renamed from: c */
    private final d f11360c;

    /* renamed from: bn.a1$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public C31931g8 f11361a;

        /* renamed from: b */
        public String f11362b;
    }

    /* renamed from: bn.a1$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.AbstractC1880g {

        /* renamed from: r */
        private List f11363r;

        /* renamed from: s */
        private final d f11364s;

        public b(d dVar) {
            this.f11364s = dVar;
        }

        /* renamed from: L */
        public C31931g8 m13748L(int i11) {
            List list = this.f11363r;
            if (list != null && i11 >= 0 && i11 < list.size()) {
                return (C31931g8) this.f11363r.get(i11);
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public void mo9990A(e eVar, int i11) {
            eVar.m13768i0(m13748L(i11));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public e mo9992C(ViewGroup viewGroup, int i11) {
            return new e(new ConversationPinItemModuleView(viewGroup.getContext(), this.f11364s));
        }

        /* renamed from: O */
        public void m13751O(List list) {
            if (list != null) {
                this.f11363r = list;
                m10008p();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            List list = this.f11363r;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bn.a1$c */
    /* loaded from: classes3.dex */
    public static class c extends KeyEventCallbackC17462c implements View.OnClickListener {

        /* renamed from: I */
        private RecyclerView f11365I;

        /* renamed from: J */
        private b f11366J;

        /* renamed from: K */
        private RobotoTextView f11367K;

        /* renamed from: L */
        private RobotoTextView f11368L;

        /* renamed from: M */
        private RobotoTextView f11369M;

        /* renamed from: N */
        private Handler f11370N;

        /* renamed from: O */
        private final d f11371O;

        /* renamed from: P */
        private final a f11372P;

        /* renamed from: Q */
        private boolean f11373Q;

        /* renamed from: R */
        private String f11374R;

        /* renamed from: S */
        private String f11375S;

        /* renamed from: T */
        final Runnable f11376T;

        /* renamed from: bn.a1$c$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    List m2398h = C0856z.m2393m().m2398h();
                    int size = m2398h.size();
                    int m122570x8 = AbstractC23309i.m122570x8();
                    boolean z11 = false;
                    if (size >= m122570x8) {
                        z11 = true;
                    }
                    c.this.f11367K.setEnabled(!z11);
                    c.this.m13759S(m122570x8);
                    c.this.m13758R(m122570x8, size);
                    c.this.m13760U(m2398h);
                    if (c.this.f11366J != null) {
                        c.this.f11366J.m13751O(m2398h);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bn.a1$c$b */
        /* loaded from: classes3.dex */
        public class b extends AbstractC0826k.c {
            public b(String str, TrackingSource trackingSource) {
                super(str, trackingSource);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ag0.AbstractC0826k.c, ag0.AbstractC0826k
            /* renamed from: a */
            public void mo2158a(Object obj) {
                ContactProfile contactProfile;
                super.mo2158a(obj);
                if (obj != null) {
                    try {
                        contactProfile = new ContactProfile((JSONObject) obj);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                } else {
                    contactProfile = null;
                }
                if (contactProfile != null) {
                    C0856z.m2393m().m2413y(contactProfile);
                    if (c.this.f11370N != null) {
                        c.this.f11370N.removeCallbacksAndMessages(null);
                        c.this.f11370N.post(c.this.f11376T);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bn.a1$c$c, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C32649c extends AbstractC0826k {
            public C32649c(String str) {
                this.f2902a = 1;
                this.f2903b = str;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // ag0.AbstractC0826k
            /* renamed from: a */
            public void mo2158a(Object obj) {
                try {
                    Pair m102835R = C19637j.f97466a.m102835R(new JSONObject(obj.toString()).getJSONObject("data"));
                    C31973j5 c31973j5 = (C31973j5) m102835R.first;
                    C0943w.m4462l().m4477n(c31973j5, (C32076q5) m102835R.second);
                    C0856z.m2393m().m2414z(c31973j5);
                    if (c.this.f11370N != null) {
                        c.this.f11370N.removeCallbacksAndMessages(null);
                        c.this.f11370N.post(c.this.f11376T);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        public c(Context context, a aVar, d dVar) {
            super(context);
            this.f11376T = new a();
            m92850A(AbstractC7409c0.max_pin_conversation_dialog_view);
            this.f11372P = aVar;
            m13761V();
            C2852a1.f11357d = new WeakReference(this);
            this.f11371O = dVar;
            this.f11370N = new Handler(Looper.getMainLooper());
            this.f11373Q = false;
            try {
                this.f11374R = AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_pin_title_max_warning_msg_desc_dialog);
                this.f11375S = AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_pin_subtitle_max_warning_msg_desc_dialog);
                this.f11368L = (RobotoTextView) m92864h(AbstractC6918a0.title_max_pin);
                RobotoTextView robotoTextView = (RobotoTextView) m92864h(AbstractC6918a0.btn_cancel);
                this.f11367K = (RobotoTextView) m92864h(AbstractC6918a0.btn_pin_conversation);
                this.f11369M = (RobotoTextView) m92864h(AbstractC6918a0.subtitle_max_pin);
                if (robotoTextView != null && this.f11367K != null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(AbstractC19178a.selectableItemBackground, typedValue, true);
                    robotoTextView.setBackgroundResource(typedValue.resourceId);
                    this.f11367K.setBackgroundResource(typedValue.resourceId);
                    this.f11367K.setTextColor(AbstractC23136l9.m118645D(context, AbstractC16801x.color_press_blue_text));
                    robotoTextView.setOnClickListener(this);
                    this.f11367K.setOnClickListener(this);
                }
                int m122570x8 = AbstractC23309i.m122570x8();
                m13759S(m122570x8);
                m13758R(m122570x8, C0856z.m2393m().m2404o());
                this.f11365I = (RecyclerView) m92864h(AbstractC6918a0.rcv_pin_conversations);
                this.f11366J = new b(dVar);
                this.f11365I.setLayoutManager(new LinearLayoutManager(context));
                this.f11365I.setAdapter(this.f11366J);
                m13762X();
                View m92864h = m92864h(R.id.content);
                if (m92864h != null) {
                    m92864h.setOnClickListener(this);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: R */
        public void m13758R(int i11, int i12) {
            String str;
            Spanned fromHtml;
            if (this.f11369M != null && !TextUtils.isEmpty(this.f11375S)) {
                int max = Math.max(1, (i12 - i11) + 1);
                String str2 = "";
                if (TextUtils.isEmpty(this.f11372P.f11362b)) {
                    str = "";
                } else {
                    str = this.f11372P.f11362b;
                }
                if (str.length() > 20) {
                    str = str.substring(0, 17) + "...";
                }
                String str3 = this.f11375S;
                Object[] objArr = new Object[3];
                objArr[0] = str;
                objArr[1] = Integer.valueOf(max);
                if (max > 1) {
                    str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
                }
                objArr[2] = str2;
                String format = String.format(str3, objArr);
                if (Build.VERSION.SDK_INT >= 24) {
                    RobotoTextView robotoTextView = this.f11369M;
                    fromHtml = Html.fromHtml(format, 63);
                    robotoTextView.setText(fromHtml);
                    return;
                }
                this.f11369M.setText(Html.fromHtml(format));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: S */
        public void m13759S(int i11) {
            String str;
            if (this.f11368L != null && !TextUtils.isEmpty(this.f11374R)) {
                RobotoTextView robotoTextView = this.f11368L;
                String str2 = this.f11374R;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i11);
                if (i11 > 1) {
                    str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_more_s);
                } else {
                    str = "";
                }
                objArr[1] = str;
                robotoTextView.setText(String.format(str2, objArr));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: U */
        public void m13760U(List list) {
            boolean z11;
            if (list != null && !list.isEmpty()) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C31931g8 c31931g8 = (C31931g8) list.get(i11);
                    if (c31931g8 != null) {
                        if (i11 == size - 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c31931g8.f146709f = z11;
                    }
                }
            }
        }

        /* renamed from: V */
        private void m13761V() {
            try {
                C17465f m92867k = m92867k();
                if (m92867k == null) {
                    return;
                }
                WindowManager.LayoutParams m92901h = m92867k.m92901h();
                m92901h.height = -1;
                m92867k.m92912v(m92901h);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        /* renamed from: X */
        private void m13762X() {
            LinearLayout linearLayout = (LinearLayout) m92864h(AbstractC6918a0.parenLayout_alert_dlg);
            if (linearLayout == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = Math.max(0, AbstractC23222t7.f112539R - AbstractC17484n.Companion.m92931b());
            }
            linearLayout.setOnClickListener(null);
        }

        /* renamed from: T */
        void m13763T() {
            this.f11373Q = true;
            Handler handler = this.f11370N;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f11370N = null;
            }
        }

        /* renamed from: W */
        public void m13764W() {
            try {
                for (C31931g8 c31931g8 : C0856z.m2393m().m2398h()) {
                    if (this.f11373Q) {
                        return;
                    }
                    if (c31931g8 != null && c31931g8.f146708e == null && c31931g8.f146707d == null) {
                        if (c31931g8.m153434e().equals(C20217u.f99970o)) {
                            ContactProfile m141809c = C28203u6.f131407a.m141809c(c31931g8.m153435f());
                            if (m141809c != null) {
                                c31931g8.f146707d = m141809c;
                            } else if (!this.f11373Q) {
                                C0843s0.m2286r().m2294e(new b(c31931g8.m153435f(), new TrackingSource((short) 1003)));
                            }
                        } else if (c31931g8.m153434e().equals(C7962g.f43287r)) {
                            C31973j5 m40388T = new ContactProfile(c31931g8.m153435f()).m40388T(false);
                            if (m40388T != null) {
                                c31931g8.f146708e = m40388T;
                            } else if (!this.f11373Q) {
                                C0843s0.m2286r().m2294e(new C32649c(c31931g8.m153435f()));
                            }
                        }
                    }
                }
                Handler handler = this.f11370N;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.f11370N.post(this.f11376T);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, com.zing.zalo.zview.dialog.InterfaceC17463d
        public void cancel() {
            m13763T();
            super.cancel();
        }

        @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, com.zing.zalo.zview.dialog.InterfaceC17463d
        public void dismiss() {
            m13763T();
            super.dismiss();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_cancel) {
                dismiss();
                return;
            }
            if (id2 == AbstractC6918a0.btn_pin_conversation) {
                dismiss();
                this.f11371O.mo13059tA(2, this.f11372P.f11361a);
            } else if (id2 == 16908290) {
                cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
        /* renamed from: p */
        public void mo13765p(Bundle bundle) {
            super.mo13765p(bundle);
            this.f11373Q = false;
            C2852a1.f11357d = new WeakReference(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
        /* renamed from: s */
        public void mo13766s() {
            super.mo13766s();
            m13764W();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
        /* renamed from: t */
        public void mo13767t() {
            super.mo13767t();
            if (C2852a1.f11357d != null) {
                C2852a1.f11357d.clear();
                C2852a1.f11357d = null;
            }
        }
    }

    /* renamed from: bn.a1$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: tA */
        void mo13059tA(int i11, C31931g8 c31931g8);
    }

    /* renamed from: bn.a1$e */
    /* loaded from: classes3.dex */
    public static class e extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        ConversationPinItemModuleView f11380I;

        public e(ConversationPinItemModuleView conversationPinItemModuleView) {
            super(conversationPinItemModuleView);
            this.f11380I = conversationPinItemModuleView;
        }

        /* renamed from: i0 */
        public void m13768i0(C31931g8 c31931g8) {
            try {
                this.f11380I.m69874W(c31931g8);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C2852a1(Context context, a aVar, d dVar) {
        this.f11358a = context;
        this.f11359b = aVar;
        this.f11360c = dVar;
    }

    /* renamed from: d */
    public static void m13746d() {
        c cVar;
        WeakReference weakReference = f11357d;
        if (weakReference != null && (cVar = (c) weakReference.get()) != null) {
            cVar.m13764W();
        }
    }

    /* renamed from: c */
    public c m13747c() {
        return new c(this.f11358a, this.f11359b, this.f11360c);
    }
}
