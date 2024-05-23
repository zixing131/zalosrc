package ic0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.Switch;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import jc0.AbstractC21220a;
import jc0.C21221b;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import og0.EnumC24251b;
import p227i3.C20218v;
import p348mi.AbstractC23306f;
import p487rl.C25826g;
import p649xl.AbstractC30012r4;
import p716zh.C31986k3;
import qm0.AbstractC25368s;
import ui0.C27280g;

/* renamed from: ic0.e */
/* loaded from: classes6.dex */
public final class C20510e extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private boolean f100772r = true;

    /* renamed from: s */
    private final List f100773s;

    /* renamed from: t */
    private EnumC24251b f100774t;

    /* renamed from: u */
    private HashMap f100775u;

    /* renamed from: ic0.e$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ic0.e$b */
    /* loaded from: classes6.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final View f100776I;

        /* renamed from: J */
        private AbstractC30012r4 f100777J;

        /* renamed from: K */
        final /* synthetic */ C20510e f100778K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C20510e c20510e, View view) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f100778K = c20510e;
            this.f100776I = view;
        }

        /* renamed from: i0 */
        public final AbstractC30012r4 m106557i0() {
            return this.f100777J;
        }

        /* renamed from: j0 */
        public final void m106558j0(AbstractC30012r4 abstractC30012r4) {
            this.f100777J = abstractC30012r4;
        }
    }

    /* renamed from: ic0.e$c */
    /* loaded from: classes6.dex */
    public final class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final View f100779I;

        /* renamed from: J */
        final /* synthetic */ C20510e f100780J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C20510e c20510e, View view) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f100780J = c20510e;
            this.f100779I = view;
            AbstractC19074t.m100206d(view, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) view;
            AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext());
            Context context = appCompatImageView.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            appCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_info_circle_line_16, AbstractC2807a.icon_tertiary));
            linearLayout.addView(appCompatImageView);
            Context context2 = linearLayout.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context2, null, AbstractC2814h.t_xxsmall);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(AbstractC23222t7.f112566j, 0, 0, 0);
            robotoTextView.setLayoutParams(layoutParams);
            robotoTextView.setTextSize(0, AbstractC23222t7.f112576o);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.text_tertiary));
            C19067n0 c19067n0 = C19067n0.f94947a;
            String string = robotoTextView.getContext().getString(AbstractC8020f0.str_zcloud_features_connect_not_support);
            AbstractC19074t.m100207e(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[]{C16805b.Companion.m89811a().m89800f()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            robotoTextView.setText(format);
            linearLayout.addView(robotoTextView);
        }
    }

    /* renamed from: ic0.e$d */
    /* loaded from: classes6.dex */
    public final class d extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final View f100781I;

        /* renamed from: J */
        final /* synthetic */ C20510e f100782J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C20510e c20510e, View view) {
            super(view);
            int i11;
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f100782J = c20510e;
            this.f100781I = view;
            AbstractC19074t.m100206d(view, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) view;
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setGravity(1);
            AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext());
            appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            if (C23212s8.m119603k()) {
                i11 = AbstractC16803z.ic_zcloud_connect_feature_white;
            } else {
                i11 = AbstractC16803z.ic_zcloud_connect_feature_dark;
            }
            appCompatImageView.setImageResource(i11);
            linearLayout.addView(appCompatImageView);
            Context context = linearLayout.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context, null, AbstractC2814h.t_xlarge);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i12 = AbstractC23222t7.f112586t;
            layoutParams.setMargins(0, i12, 0, i12);
            robotoTextView.setLayoutParams(layoutParams);
            robotoTextView.setTextSize(0, AbstractC23222t7.f112598z);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.text_primary));
            C19067n0 c19067n0 = C19067n0.f94947a;
            String string = robotoTextView.getContext().getString(AbstractC8020f0.str_zcloud_features_connect_title);
            AbstractC19074t.m100207e(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[]{C16805b.Companion.m89811a().m89800f()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            robotoTextView.setText(format);
            robotoTextView.setTextAlignment(4);
            robotoTextView.setTextStyleBold(true);
            linearLayout.addView(robotoTextView);
        }
    }

    public C20510e() {
        int i11;
        List m131505m;
        AbstractC21220a[] abstractC21220aArr = new AbstractC21220a[5];
        abstractC21220aArr[0] = AbstractC21220a.d.f103455b;
        EnumC24251b enumC24251b = EnumC24251b.f117146q;
        abstractC21220aArr[1] = new AbstractC21220a.a(new C21221b(enumC24251b, AbstractC8020f0.str_zcloud_features_connect_cloud_media_title, AbstractC8020f0.str_zcloud_features_connect_cloud_media_description));
        EnumC24251b enumC24251b2 = EnumC24251b.f117148s;
        int i12 = AbstractC8020f0.str_zcloud_features_connect_messages_backup_title;
        if (!AbstractC23306f.m120692n().m133023A()) {
            i11 = AbstractC8020f0.str_zcloud_features_connect_messages_backup_description;
        } else {
            i11 = AbstractC8020f0.f43878x9dbbbe8c;
        }
        abstractC21220aArr[2] = new AbstractC21220a.a(new C21221b(enumC24251b2, i12, i11));
        abstractC21220aArr[3] = new AbstractC21220a.a(new C21221b(EnumC24251b.f117147r, AbstractC8020f0.str_zcloud_features_connect_my_cloud_title, AbstractC8020f0.str_zcloud_features_connect_my_cloud_description));
        abstractC21220aArr[4] = AbstractC21220a.b.f103454b;
        m131505m = AbstractC25368s.m131505m(abstractC21220aArr);
        this.f100773s = m131505m;
        this.f100774t = enumC24251b;
        this.f100775u = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m106549R(C20510e c20510e, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(c20510e, "this$0");
        c20510e.f100772r = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m106550S(AbstractC30012r4 abstractC30012r4, View view) {
        abstractC30012r4.f139196R.setChecked(!r0.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m106551T(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static final void m106552U(C20510e c20510e, b bVar, AbstractC30012r4 abstractC30012r4, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(c20510e, "this$0");
        AbstractC19074t.m100208f(bVar, "$this_with");
        Object obj = c20510e.f100773s.get(bVar.m9929A());
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.setup.adapter.item.ZCloudConnectFeatureViewItem.BodyView");
        C25826g c25826g = (C25826g) c20510e.f100775u.get(((AbstractC21220a.a) obj).m109963b().m109965b());
        if (c25826g == null) {
            return;
        }
        c25826g.m133201b(z11);
        Object obj2 = c20510e.f100773s.get(bVar.m9929A());
        AbstractC21220a.a aVar = null;
        if (!(((AbstractC21220a) obj2) instanceof AbstractC21220a.a)) {
            obj2 = null;
        }
        AbstractC21220a abstractC21220a = (AbstractC21220a) obj2;
        if (abstractC21220a != null) {
            AbstractC21220a.a aVar2 = (AbstractC21220a.a) abstractC21220a;
            if (aVar2.m109963b().m109965b() == EnumC24251b.f117148s) {
                aVar = aVar2;
            }
            if (aVar != null) {
                Switch r12 = abstractC30012r4.f139201W;
                r12.setEnabled(z11);
                r12.setChecked(z11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        AbstractC21220a abstractC21220a = (AbstractC21220a) this.f100773s.get(i11);
        if (!(abstractC1876c0 instanceof d)) {
            if (abstractC1876c0 instanceof b) {
                b bVar = (b) abstractC1876c0;
                AbstractC19074t.m100206d(abstractC21220a, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.setup.adapter.item.ZCloudConnectFeatureViewItem.BodyView");
                C21221b m109963b = ((AbstractC21220a.a) abstractC21220a).m109963b();
                C25826g c25826g = (C25826g) this.f100775u.get(m109963b.m109965b());
                if (c25826g == null) {
                    return;
                }
                AbstractC19074t.m100205c(c25826g);
                AbstractC30012r4 m106557i0 = bVar.m106557i0();
                if (m106557i0 == null) {
                    return;
                }
                Context context = m106557i0.getRoot().getContext();
                if (m109963b.m109965b() == EnumC24251b.f117147r) {
                    m106557i0.f139197S.setEnabled(false);
                    m106557i0.f139196R.setEnabled(false);
                }
                m106557i0.f139196R.m90551f(c25826g.m133200a(), false);
                m106557i0.f139202X.setText(context.getString(m109963b.m109966c()));
                String string = context.getString(m109963b.m109964a());
                AbstractC19074t.m100207e(string, "getString(...)");
                m106557i0.f139198T.setText(string);
                Object obj = this.f100773s.get(bVar.m9929A());
                AbstractC21220a.a aVar = null;
                if (!(((AbstractC21220a) obj) instanceof AbstractC21220a.a)) {
                    obj = null;
                }
                AbstractC21220a abstractC21220a2 = (AbstractC21220a) obj;
                if (abstractC21220a2 != null) {
                    AbstractC21220a.a aVar2 = (AbstractC21220a.a) abstractC21220a2;
                    if (aVar2.m109963b().m109965b() == EnumC24251b.f117148s) {
                        aVar = aVar2;
                    }
                    if (aVar != null) {
                        if (AbstractC23306f.m120692n().m133023A() || C31986k3.f147083a.m154111U1()) {
                            LinearLayout linearLayout = m106557i0.f139199U;
                            AbstractC19074t.m100207e(linearLayout, "expandContainer");
                            linearLayout.setVisibility(8);
                        }
                        m106557i0.f139203Y.setText(context.getString(AbstractC8020f0.str_title_auto_back_up_daily));
                        m106557i0.f139200V.setVisibility(0);
                        m106557i0.f139201W.setEnabled(m106557i0.f139196R.isChecked());
                        m106557i0.f139201W.setChecked(this.f100772r);
                        m106557i0.f139201W.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ic0.d
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                                C20510e.m106549R(C20510e.this, compoundButton, z11);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z11 = abstractC1876c0 instanceof c;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
                linearLayout.setGravity(16);
                linearLayout.setOrientation(0);
                return new c(this, linearLayout);
            }
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.item_zcloud_connect_feature, viewGroup, false);
            final AbstractC30012r4 m148436Q = AbstractC30012r4.m148436Q(inflate);
            AbstractC19074t.m100205c(inflate);
            final b bVar = new b(this, inflate);
            bVar.m106558j0(m148436Q);
            m148436Q.f139195Q.setOnClickListener(new View.OnClickListener() { // from class: ic0.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C20510e.m106551T(view);
                }
            });
            m148436Q.f139196R.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ic0.b
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    C20510e.m106552U(C20510e.this, bVar, m148436Q, compoundButton, z11);
                }
            });
            m148436Q.f139197S.setOnClickListener(new View.OnClickListener() { // from class: ic0.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C20510e.m106550S(AbstractC30012r4.this, view);
                }
            });
            return bVar;
        }
        LinearLayout linearLayout2 = new LinearLayout(viewGroup.getContext());
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(1);
        return new d(this, linearLayout2);
    }

    /* renamed from: P */
    public final void m106553P(Bundle bundle) {
        EnumC24251b enumC24251b;
        AbstractC19074t.m100208f(bundle, "savedInstanceState");
        String string = bundle.getString("ARG_EXPANDED");
        if (string != null) {
            enumC24251b = EnumC24251b.valueOf(string);
        } else {
            enumC24251b = null;
        }
        this.f100774t = enumC24251b;
        this.f100772r = bundle.getBoolean("ARG_STATE_CONFIG_AUTO_BACKUP", this.f100772r);
        m10008p();
    }

    /* renamed from: Q */
    public final boolean m106554Q() {
        return this.f100772r;
    }

    /* renamed from: V */
    public final void m106555V(Bundle bundle) {
        String str;
        AbstractC19074t.m100208f(bundle, "outState");
        EnumC24251b enumC24251b = this.f100774t;
        if (enumC24251b != null) {
            str = enumC24251b.toString();
        } else {
            str = null;
        }
        bundle.putString("ARG_EXPANDED", str);
        bundle.putBoolean("ARG_STATE_CONFIG_AUTO_BACKUP", this.f100772r);
    }

    /* renamed from: W */
    public final void m106556W(HashMap hashMap) {
        AbstractC19074t.m100208f(hashMap, "itemsStatus");
        this.f100775u = hashMap;
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f100773s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((AbstractC21220a) this.f100773s.get(i11)).m109962a();
    }
}
