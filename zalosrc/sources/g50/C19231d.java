package g50;

import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import h50.C19881b;
import java.util.ArrayList;
import java.util.List;
import l50.C22083e;
import p361nb.C23648e;
import p649xl.C30133y6;

/* renamed from: g50.d */
/* loaded from: classes5.dex */
public final class C19231d extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f95710r = new ArrayList();

    /* renamed from: s */
    private Ringtone f95711s;

    /* renamed from: t */
    private String f95712t;

    /* renamed from: u */
    private CheckBox f95713u;

    /* renamed from: g50.d$a */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final C30133y6 f95714I;

        /* renamed from: J */
        private final RobotoTextView f95715J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "view");
            C30133y6 m148731a = C30133y6.m148731a(view);
            AbstractC19074t.m100207e(m148731a, "bind(...)");
            this.f95714I = m148731a;
            RobotoTextView robotoTextView = m148731a.f140017r;
            AbstractC19074t.m100207e(robotoTextView, "name");
            this.f95715J = robotoTextView;
        }

        /* renamed from: i0 */
        public final void m100904i0(C19881b c19881b) {
            AbstractC19074t.m100208f(c19881b, "info");
            this.f95715J.setText(c19881b.m103569b());
        }

        /* renamed from: j0 */
        public final C30133y6 m100905j0() {
            return this.f95714I;
        }
    }

    public C19231d() {
        String m3713c7 = AbstractC0924m0.m3713c7();
        AbstractC19074t.m100207e(m3713c7, "getUriSelectedSystemRingtone(...)");
        this.f95712t = m3713c7;
    }

    /* renamed from: M */
    private final void m100894M(a aVar, C19881b c19881b, Integer num) {
        int m103568a = c19881b.m103568a();
        if (num != null && num.intValue() == m103568a && c19881b.m103568a() != 2) {
            CheckBox checkBox = aVar.m100905j0().f140016q;
            AbstractC19074t.m100207e(checkBox, "checkbox");
            m100897V(checkBox);
        } else {
            if (num != null && num.intValue() == 2 && AbstractC19074t.m100204b(c19881b.m103570c().toString(), this.f95712t)) {
                CheckBox checkBox2 = aVar.m100905j0().f140016q;
                AbstractC19074t.m100207e(checkBox2, "checkbox");
                m100897V(checkBox2);
                return;
            }
            aVar.m100905j0().f140016q.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m100895P(C19231d c19231d, C19881b c19881b, a aVar, View view) {
        String uri;
        AbstractC19074t.m100208f(c19231d, "this$0");
        AbstractC19074t.m100208f(c19881b, "$item");
        AbstractC19074t.m100208f(aVar, "$holder");
        CheckBox checkBox = c19231d.f95713u;
        if (checkBox != null) {
            checkBox.setChecked(false);
        }
        if (c19881b.m103568a() == 1) {
            uri = "";
        } else {
            uri = c19881b.m103570c().toString();
            AbstractC19074t.m100205c(uri);
        }
        c19231d.f95712t = uri;
        AbstractC0924m0.m3526Vp(uri);
        AbstractC0924m0.m3323Op(c19881b.m103568a());
        CheckBox checkBox2 = aVar.m100905j0().f140016q;
        AbstractC19074t.m100207e(checkBox2, "checkbox");
        c19231d.m100897V(checkBox2);
        c19231d.m100903U(c19881b.m103568a());
        Context context = view.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c19231d.m100896R(context, c19881b.m103570c());
    }

    /* renamed from: R */
    private final void m100896R(Context context, Uri uri) {
        try {
            Ringtone ringtone = this.f95711s;
            if (ringtone != null) {
                ringtone.stop();
            }
            Ringtone ringtone2 = RingtoneManager.getRingtone(context, uri);
            if (ringtone2 != null) {
                ringtone2.play();
            } else {
                ringtone2 = null;
            }
            this.f95711s = ringtone2;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: V */
    private final void m100897V(CheckBox checkBox) {
        checkBox.setChecked(true);
        this.f95713u = checkBox;
    }

    /* renamed from: N */
    public final C19881b m100898N(int i11) {
        if (i11 >= 0 && i11 < this.f95710r.size()) {
            return (C19881b) this.f95710r.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9990A(final a aVar, int i11) {
        int i12;
        AbstractC19074t.m100208f(aVar, "holder");
        try {
            aVar.m100904i0((C19881b) this.f95710r.get(i11));
            final C19881b m100898N = m100898N(i11);
            if (m100898N == null) {
                return;
            }
            View view = aVar.m100905j0().f140018s;
            if (i11 == mo10003k() - 1) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            view.setVisibility(i12);
            m100894M(aVar, m100898N, (Integer) new C22083e(null, 1, null).m101509a(Boolean.TRUE));
            aVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: g50.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C19231d.m100895P(C19231d.this, m100898N, aVar, view2);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.layout_row_ringtone, viewGroup, false);
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        return new a(inflate);
    }

    /* renamed from: S */
    public final void m100901S(List list) {
        AbstractC19074t.m100208f(list, "mData");
        this.f95710r = list;
    }

    /* renamed from: T */
    public final void m100902T() {
        Ringtone ringtone = this.f95711s;
        if (ringtone != null) {
            ringtone.stop();
        }
    }

    /* renamed from: U */
    public final void m100903U(int i11) {
        C0815e1.m2075D().m2100V(new C23648e(28, "setting_call", 0, "call_setting_ringtone_selected", String.valueOf(i11)), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f95710r.size();
    }
}
