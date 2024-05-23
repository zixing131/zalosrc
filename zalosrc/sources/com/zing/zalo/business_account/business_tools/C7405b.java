package com.zing.zalo.business_account.business_tools;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.business_account.business_tools.AbstractC7404a;
import com.zing.zalo.business_account.business_tools.AbstractC7406c;
import com.zing.zalo.business_account.business_tools.C7405b;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalocore.CoreUtility;
import de.InterfaceC17894c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p055ce.AbstractC3439h;
import p649xl.C29883k1;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import ui0.C27280g;

/* renamed from: com.zing.zalo.business_account.business_tools.b */
/* loaded from: classes3.dex */
public final class C7405b extends RecyclerView.AbstractC1880g {
    public static final b Companion = new b(null);

    /* renamed from: r */
    private final InterfaceC17894c f40245r;

    /* renamed from: s */
    private final ArrayList f40246s;

    /* renamed from: com.zing.zalo.business_account.business_tools.b$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final InterfaceC17894c f40247I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC17894c interfaceC17894c, View view) {
            super(view);
            AbstractC19074t.m100208f(interfaceC17894c, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
            this.f40247I = interfaceC17894c;
        }

        /* renamed from: i0 */
        public void mo37597i0(AbstractC7406c abstractC7406c) {
            AbstractC19074t.m100208f(abstractC7406c, "item");
        }

        /* renamed from: j0 */
        public final InterfaceC17894c m37598j0() {
            return this.f40247I;
        }
    }

    /* renamed from: com.zing.zalo.business_account.business_tools.b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.business_account.business_tools.b$c */
    /* loaded from: classes3.dex */
    public static final class c extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC17894c interfaceC17894c, View view) {
            super(interfaceC17894c, view);
            AbstractC19074t.m100208f(interfaceC17894c, "actionHandler");
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: com.zing.zalo.business_account.business_tools.b$d */
    /* loaded from: classes3.dex */
    public static final class d extends a {

        /* renamed from: J */
        private final C29883k1 f40248J;

        /* renamed from: K */
        private AbstractC7406c.c f40249K;

        /* renamed from: L */
        private final InterfaceC24854k f40250L;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.business_account.business_tools.b$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {
            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final RecyclingImageView mo12V4() {
                RecyclingImageView recyclingImageView = new RecyclingImageView(d.this.f7784p.getContext());
                d dVar = d.this;
                recyclingImageView.setImageResource(AbstractC23322a.zds_ic_info_circle_line_16);
                recyclingImageView.setColorFilter(C23212s8.m119607o(recyclingImageView.getContext(), AbstractC2807a.icon_01));
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.leftMargin = dVar.f7784p.getContext().getResources().getDimensionPixelSize(AbstractC2809c.f11264u);
                recyclingImageView.setLayoutParams(marginLayoutParams);
                return recyclingImageView;
            }
        }

        /* renamed from: com.zing.zalo.business_account.business_tools.b$d$b */
        /* loaded from: classes3.dex */
        public static final class b extends ClickableSpan {

            /* renamed from: q */
            final /* synthetic */ String f40253q;

            /* renamed from: r */
            final /* synthetic */ TextView f40254r;

            b(String str, TextView textView) {
                this.f40253q = str;
                this.f40254r = textView;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                AbstractC19074t.m100208f(view, "widget");
                d.this.m37598j0().mo37585oj(new AbstractC7404a.c(this.f40253q));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                AbstractC19074t.m100208f(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setColor(C23212s8.m119607o(this.f40254r.getContext(), AbstractC2807a.link_01));
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(InterfaceC17894c interfaceC17894c, C29883k1 c29883k1) {
            super(interfaceC17894c, r0);
            InterfaceC24854k m129210a;
            AbstractC19074t.m100208f(interfaceC17894c, "actionHandler");
            AbstractC19074t.m100208f(c29883k1, "binding");
            LinearLayout root = c29883k1.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f40248J = c29883k1;
            m129210a = AbstractC24856m.m129210a(new a());
            this.f40250L = m129210a;
            TrackingImageView trackingImageView = c29883k1.f138441t;
            trackingImageView.setIdTracking("ba_tool_share_link");
            if (trackingImageView.getContext() != null) {
                Context context = trackingImageView.getContext();
                AbstractC19074t.m100205c(context);
                trackingImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_share_line_16, AbstractC2807a.icon_01));
            }
            TrackingImageView trackingImageView2 = c29883k1.f138440s;
            trackingImageView2.setIdTracking("ba_tool_copy_link");
            if (trackingImageView2.getContext() != null) {
                Context context2 = trackingImageView2.getContext();
                AbstractC19074t.m100205c(context2);
                trackingImageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_copy_line_16, AbstractC2807a.icon_01));
            }
            c29883k1.f138444w.setOnClickListener(new View.OnClickListener() { // from class: de.f

                /* renamed from: q */
                public final /* synthetic */ InterfaceC17894c f90412q;

                public /* synthetic */ ViewOnClickListenerC17897f(InterfaceC17894c interfaceC17894c2) {
                    r2 = interfaceC17894c2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7405b.d.m37603o0(C7405b.d.this, r2, view);
                }
            });
            c29883k1.f138441t.setOnClickListener(new View.OnClickListener() { // from class: de.g

                /* renamed from: q */
                public final /* synthetic */ InterfaceC17894c f90414q;

                public /* synthetic */ ViewOnClickListenerC17898g(InterfaceC17894c interfaceC17894c2) {
                    r2 = interfaceC17894c2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7405b.d.m37604p0(C7405b.d.this, r2, view);
                }
            });
            c29883k1.f138440s.setOnClickListener(new View.OnClickListener() { // from class: de.h

                /* renamed from: q */
                public final /* synthetic */ InterfaceC17894c f90416q;

                public /* synthetic */ ViewOnClickListenerC17899h(InterfaceC17894c interfaceC17894c2) {
                    r2 = interfaceC17894c2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7405b.d.m37605q0(C7405b.d.this, r2, view);
                }
            });
        }

        /* renamed from: o0 */
        public static final void m37603o0(d dVar, InterfaceC17894c interfaceC17894c, View view) {
            AbstractC19074t.m100208f(dVar, "this$0");
            AbstractC19074t.m100208f(interfaceC17894c, "$actionHandler");
            AbstractC7406c.c cVar = dVar.f40249K;
            if (cVar != null && cVar.m37615f().length() > 0) {
                interfaceC17894c.mo37585oj(new AbstractC7404a.d(cVar.m37615f()));
            }
        }

        /* renamed from: p0 */
        public static final void m37604p0(d dVar, InterfaceC17894c interfaceC17894c, View view) {
            AbstractC19074t.m100208f(dVar, "this$0");
            AbstractC19074t.m100208f(interfaceC17894c, "$actionHandler");
            AbstractC7406c.c cVar = dVar.f40249K;
            if (cVar != null && cVar.m37615f().length() > 0) {
                interfaceC17894c.mo37585oj(new AbstractC7404a.e(cVar.m37615f()));
            }
        }

        /* renamed from: q0 */
        public static final void m37605q0(d dVar, InterfaceC17894c interfaceC17894c, View view) {
            AbstractC19074t.m100208f(dVar, "this$0");
            AbstractC19074t.m100208f(interfaceC17894c, "$actionHandler");
            AbstractC7406c.c cVar = dVar.f40249K;
            if (cVar != null && cVar.m37615f().length() > 0) {
                interfaceC17894c.mo37585oj(new AbstractC7404a.b(cVar.m37615f()));
            }
        }

        /* renamed from: r0 */
        public static final void m37606r0(d dVar, View view) {
            AbstractC19074t.m100208f(dVar, "this$0");
            dVar.m37598j0().mo37585oj(AbstractC7404a.f.f40244a);
        }

        /* renamed from: s0 */
        private final ImageView m37607s0() {
            return (ImageView) this.f40250L.getValue();
        }

        /* renamed from: t0 */
        private final void m37608t0(TextView textView, CharSequence charSequence, String str) {
            textView.setMovementMethod(CustomMovementMethod.m56305e());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            if (str.length() > 0) {
                spannableStringBuilder.append((CharSequence) " ");
                String string = textView.getContext().getString(AbstractC8020f0.business_tools_share_link_learn_more);
                AbstractC19074t.m100207e(string, "getString(...)");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) string);
                spannableStringBuilder.setSpan(new b(str, textView), length, spannableStringBuilder.length(), 33);
            }
            textView.setText(spannableStringBuilder);
        }

        @Override // com.zing.zalo.business_account.business_tools.C7405b.a
        /* renamed from: i0 */
        public void mo37597i0(AbstractC7406c abstractC7406c) {
            AbstractC7406c.c cVar;
            List m131496e;
            AbstractC19074t.m100208f(abstractC7406c, "item");
            super.mo37597i0(abstractC7406c);
            if (abstractC7406c instanceof AbstractC7406c.c) {
                cVar = (AbstractC7406c.c) abstractC7406c;
            } else {
                cVar = null;
            }
            this.f40249K = cVar;
            if (cVar == null) {
                return;
            }
            Avatar avatar = this.f40248J.f138439r;
            m131496e = AbstractC25366r.m131496e(CoreUtility.f89233i);
            avatar.m90480p(m131496e);
            this.f40248J.f138438q.removeAllViews();
            Context context = this.f7784p.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView m17279m = AbstractC3439h.m17279m(context, cVar.m37612c(), 1);
            if (m17279m != null) {
                this.f40248J.f138438q.addView(m17279m);
                this.f40248J.f138438q.addView(m37607s0());
                this.f40248J.f138438q.setIdTracking("ba_tool_account_info");
                this.f40248J.f138438q.setOnClickListener(new View.OnClickListener() { // from class: de.e
                    public /* synthetic */ ViewOnClickListenerC17896e() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7405b.d.m37606r0(C7405b.d.this, view);
                    }
                });
            } else {
                this.f40248J.f138438q.setOnClickListener(null);
            }
            this.f40248J.f138445x.setText(cVar.m37611b());
            this.f40248J.f138444w.setText(cVar.m37615f());
            this.f40248J.f138443v.setText(cVar.m37613d());
            RobotoTextView robotoTextView = this.f40248J.f138443v;
            AbstractC19074t.m100207e(robotoTextView, "businessToolTvLearnMore");
            m37608t0(robotoTextView, cVar.m37613d(), cVar.m37614e());
            if (cVar.m37615f().length() == 0) {
                this.f40248J.f138442u.setVisibility(8);
                this.f40248J.f138443v.setVisibility(8);
            }
        }
    }

    /* renamed from: com.zing.zalo.business_account.business_tools.b$e */
    /* loaded from: classes3.dex */
    public static final class e extends a {

        /* renamed from: J */
        private final BusinessToolsSettingItemView f40255J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC17894c interfaceC17894c, BusinessToolsSettingItemView businessToolsSettingItemView) {
            super(interfaceC17894c, businessToolsSettingItemView);
            AbstractC19074t.m100208f(interfaceC17894c, "actionHandler");
            AbstractC19074t.m100208f(businessToolsSettingItemView, "settingItemView");
            this.f40255J = businessToolsSettingItemView;
        }

        @Override // com.zing.zalo.business_account.business_tools.C7405b.a
        /* renamed from: i0 */
        public void mo37597i0(AbstractC7406c abstractC7406c) {
            AbstractC7406c.d dVar;
            AbstractC19074t.m100208f(abstractC7406c, "item");
            super.mo37597i0(abstractC7406c);
            if (abstractC7406c instanceof AbstractC7406c.d) {
                dVar = (AbstractC7406c.d) abstractC7406c;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                return;
            }
            this.f40255J.m37574p(m37598j0(), dVar);
        }
    }

    public C7405b(InterfaceC17894c interfaceC17894c) {
        AbstractC19074t.m100208f(interfaceC17894c, "actionHandler");
        this.f40245r = interfaceC17894c;
        this.f40246s = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        Object obj = this.f40246s.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        aVar.mo37597i0((AbstractC7406c) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        a cVar;
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return new a(this.f40245r, new View(context));
                }
                AbstractC19074t.m100205c(context);
                BusinessToolsSettingItemView businessToolsSettingItemView = new BusinessToolsSettingItemView(context);
                businessToolsSettingItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                cVar = new e(this.f40245r, businessToolsSettingItemView);
            } else {
                C29883k1 m148147c = C29883k1.m148147c(from, viewGroup, false);
                AbstractC19074t.m100207e(m148147c, "inflate(...)");
                cVar = new d(this.f40245r, m148147c);
            }
        } else {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23222t7.f112572m));
            cVar = new c(this.f40245r, view);
        }
        return cVar;
    }

    /* renamed from: N */
    public final void m37596N(List list) {
        AbstractC19074t.m100208f(list, "itemList");
        this.f40246s.clear();
        this.f40246s.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f40246s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        AbstractC7406c abstractC7406c = (AbstractC7406c) this.f40246s.get(i11);
        if (abstractC7406c instanceof AbstractC7406c.b) {
            return 0;
        }
        if (abstractC7406c instanceof AbstractC7406c.c) {
            return 1;
        }
        if (abstractC7406c instanceof AbstractC7406c.d) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
