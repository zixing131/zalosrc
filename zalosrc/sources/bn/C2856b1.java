package bn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import p649xl.C29728b8;

/* renamed from: bn.b1 */
/* loaded from: classes3.dex */
public class C2856b1 extends KeyEventCallbackC17462c {

    /* renamed from: I */
    private C29728b8 f11384I;

    /* renamed from: bn.b1$a */
    /* loaded from: classes3.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: p */
        private C29728b8 f11385p;

        /* renamed from: q */
        private C2856b1 f11386q;

        /* renamed from: r */
        private final Context f11387r;

        /* renamed from: s */
        private ContactProfile f11388s;

        /* renamed from: t */
        private b f11389t;

        /* renamed from: u */
        private boolean f11390u = true;

        /* renamed from: v */
        private boolean f11391v = true;

        /* renamed from: w */
        private boolean f11392w = true;

        /* renamed from: x */
        private boolean f11393x = true;

        /* renamed from: y */
        private boolean f11394y;

        /* renamed from: z */
        private boolean f11395z;

        public a(Context context) {
            this.f11387r = context;
        }

        /* renamed from: a */
        public C2856b1 m13772a() {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            C2856b1 c2856b1 = new C2856b1(this.f11387r, AbstractC8915g0.Theme_Dialog_Translucent);
            this.f11386q = c2856b1;
            c2856b1.m92870v(1);
            C29728b8 c29728b8 = this.f11386q.f11384I;
            this.f11385p = c29728b8;
            ContactProfile contactProfile = this.f11388s;
            int i17 = 0;
            if (contactProfile != null) {
                c29728b8.f137318q.m75731c(contactProfile);
                this.f11385p.f137316B.setText(this.f11388s.m40383Q(true, false));
            }
            this.f11385p.f137326y.setOnClickListener(this);
            this.f11385p.f137324w.setOnClickListener(this);
            this.f11385p.f137322u.setOnClickListener(this);
            this.f11385p.f137323v.setOnClickListener(this);
            this.f11385p.f137325x.setOnClickListener(this);
            this.f11385p.f137327z.setOnClickListener(this);
            this.f11385p.f137315A.setOnClickListener(this);
            this.f11385p.f137327z.setChecked(this.f11395z);
            this.f11385p.f137315A.setChecked(this.f11394y);
            TextView textView = this.f11385p.f137324w;
            if (this.f11390u) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
            View view = this.f11385p.f137321t;
            if (this.f11390u) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            view.setVisibility(i12);
            LinearLayout linearLayout = this.f11385p.f137322u;
            if (this.f11391v) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout.setVisibility(i13);
            View view2 = this.f11385p.f137319r;
            if (this.f11391v) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            view2.setVisibility(i14);
            LinearLayout linearLayout2 = this.f11385p.f137323v;
            if (this.f11392w) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            linearLayout2.setVisibility(i15);
            LinearLayout linearLayout3 = this.f11385p.f137323v;
            if (this.f11392w) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            linearLayout3.setVisibility(i16);
            TextView textView2 = this.f11385p.f137325x;
            if (!this.f11393x) {
                i17 = 8;
            }
            textView2.setVisibility(i17);
            this.f11386q.m92852C(this.f11385p.getRoot(), new ViewGroup.LayoutParams(-1, -2));
            this.f11386q.m92867k().m92889H(-1, -2);
            return this.f11386q;
        }

        /* renamed from: b */
        public void m13773b(boolean z11) {
            this.f11394y = z11;
        }

        /* renamed from: c */
        public void m13774c(ContactProfile contactProfile) {
            this.f11388s = contactProfile;
        }

        /* renamed from: d */
        public void m13775d(boolean z11) {
            this.f11391v = z11;
        }

        /* renamed from: e */
        public void m13776e(boolean z11) {
            this.f11392w = z11;
        }

        /* renamed from: f */
        public void m13777f(boolean z11) {
            this.f11390u = z11;
        }

        /* renamed from: g */
        public void m13778g(boolean z11) {
            this.f11393x = z11;
        }

        /* renamed from: h */
        public void m13779h(boolean z11) {
            this.f11395z = z11;
        }

        /* renamed from: i */
        public void m13780i(b bVar) {
            this.f11389t = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f11389t != null) {
                int id2 = view.getId();
                if (id2 != AbstractC6918a0.llProfile && id2 != AbstractC6918a0.llChangeAlias && id2 != AbstractC6918a0.llDelete) {
                    if (id2 != AbstractC6918a0.llAddFavorite && id2 != AbstractC6918a0.swAddFavorite) {
                        if (id2 == AbstractC6918a0.llBlockMsg || id2 == AbstractC6918a0.swBlockMsg) {
                            this.f11385p.f137315A.setChecked(!r4.isChecked());
                            this.f11389t.mo13781a(this.f11386q, AbstractC6918a0.llBlockMsg, this.f11385p.f137315A.isChecked());
                            return;
                        }
                        return;
                    }
                    this.f11385p.f137327z.setChecked(!r4.isChecked());
                    this.f11389t.mo13781a(this.f11386q, AbstractC6918a0.llAddFavorite, this.f11385p.f137327z.isChecked());
                    return;
                }
                this.f11389t.mo13781a(this.f11386q, id2, false);
            }
        }
    }

    /* renamed from: bn.b1$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo13781a(KeyEventCallbackC17462c keyEventCallbackC17462c, int i11, boolean z11);
    }

    public C2856b1(Context context, int i11) {
        super(context, i11);
        this.f11384I = C29728b8.m147767c((LayoutInflater) context.getSystemService("layout_inflater"));
    }

    /* renamed from: M */
    public void m13770M(boolean z11) {
        this.f11384I.f137315A.setChecked(z11);
    }

    /* renamed from: N */
    public void m13771N(boolean z11) {
        this.f11384I.f137327z.setChecked(z11);
    }
}
