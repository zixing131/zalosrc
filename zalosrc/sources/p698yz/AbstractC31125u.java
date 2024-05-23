package p698yz;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.text.style.ImageSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.core.graphics.drawable.AbstractC1414a;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import bi0.AbstractC2814h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zdesign.component.Button;
import dj.C17945a0;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import le0.AbstractC22459a;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23250w4;
import mj0.AbstractC23322a;
import on0.AbstractC24319c;
import on0.AbstractC24342w;
import p269jj.C21275a;
import p304ks.AbstractC21935u;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p649xl.C30111x1;
import qm0.AbstractC25368s;
import th.AbstractC26687h;
import th.C26686g;
import ui0.C27280g;
import xb0.C29572a;
import xb0.C29573b;

/* renamed from: yz.u */
/* loaded from: classes4.dex */
public abstract class AbstractC31125u {

    /* renamed from: yz.u$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f143371a;

        static {
            int[] iArr = new int[EnumC31105a.values().length];
            try {
                iArr[EnumC31105a.f143337x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31105a.f143335v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31105a.f143336w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC31105a.f143334u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC31105a.f143330q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC31105a.f143332s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC31105a.f143333t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f143371a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m151143A(C31126v c31126v, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        Runnable m151196c = c31126v.m151196c();
        if (m151196c != null) {
            m151196c.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m151144B(C31126v c31126v, String str, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        AbstractC19074t.m100208f(str, "$learnMoreUrl");
        InterfaceC27218a m151194a = c31126v.m151194a();
        if (m151194a != null) {
            AbstractC23152n3.m119050j0(m151194a.getContext(), str);
        }
    }

    /* renamed from: C */
    private static final void m151145C(Context context, C30111x1 c30111x1, List list, boolean z11) {
        String m118743r0;
        int i11;
        if (list.isEmpty()) {
            c30111x1.f139871v.setVisibility(8);
            c30111x1.f139869t.setVisibility(8);
            return;
        }
        int i12 = 0;
        c30111x1.f139871v.setVisibility(0);
        RobotoTextView robotoTextView = c30111x1.f139871v;
        if (z11) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_zcloud_rolled_media_hint_title);
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_rolled_media_hint);
        }
        robotoTextView.setText(m118743r0);
        c30111x1.f139869t.setVisibility(0);
        c30111x1.f139869t.removeAllViews();
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            CharSequence charSequence = (CharSequence) obj;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (z11) {
                if (i12 > 0) {
                    i11 = AbstractC23222t7.f112586t;
                } else {
                    i11 = AbstractC23222t7.f112566j;
                }
                layoutParams.topMargin = i11;
            } else if (i12 > 0) {
                layoutParams.topMargin = c30111x1.getRoot().getResources().getDimensionPixelSize(AbstractC2809c.f11264u);
            }
            if (z11) {
                c30111x1.f139869t.addView(m151159Q(context, charSequence, i13), layoutParams);
            } else {
                c30111x1.f139869t.addView(m151158P(context, charSequence), layoutParams);
            }
            i12 = i13;
        }
    }

    /* renamed from: D */
    static /* synthetic */ void m151146D(Context context, C30111x1 c30111x1, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        m151145C(context, c30111x1, list, z11);
    }

    /* renamed from: E */
    private static final void m151147E(final C31126v c31126v) {
        C30111x1 m151195b = c31126v.m151195b();
        final String str = C21275a.Companion.m110211a().m110204g().f110049C;
        RobotoTextView robotoTextView = m151195b.f139872w;
        AbstractC19074t.m100207e(robotoTextView, "rolledMediaTvLearnMore");
        if (!TextUtils.isEmpty(str)) {
            robotoTextView.setVisibility(0);
            robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: yz.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31125u.m151148F(C31126v.this, str, view);
                }
            });
            m151156N(robotoTextView, c31126v, false, 4, null);
            return;
        }
        robotoTextView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m151148F(C31126v c31126v, String str, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        AbstractC19074t.m100208f(str, "$learnMoreUrl");
        ZaloWebView.Companion.m87168C(c31126v.m151194a(), str);
    }

    /* renamed from: G */
    private static final void m151149G(final C31126v c31126v) {
        c31126v.m151195b().f139872w.setVisibility(8);
        c31126v.m151195b().f139867r.setVisibility(8);
        C30111x1 m151195b = c31126v.m151195b();
        final String str = C21275a.Companion.m110211a().m110204g().f110049C;
        if (!TextUtils.isEmpty(str)) {
            m151195b.f139866q.setVisibility(0);
            m151195b.f139866q.setOnClickListener(new View.OnClickListener() { // from class: yz.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31125u.m151150H(C31126v.this, str, view);
                }
            });
            Button button = m151195b.f139866q;
            AbstractC19074t.m100207e(button, "rolledMediaBtnPrimary");
            m151156N(button, c31126v, false, 4, null);
            return;
        }
        m151195b.f139866q.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final void m151150H(C31126v c31126v, String str, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        AbstractC19074t.m100208f(str, "$learnMoreUrl");
        ZaloWebView.Companion.m87168C(c31126v.m151194a(), str);
    }

    /* renamed from: I */
    public static final void m151151I(C31126v c31126v) {
        AbstractC19074t.m100208f(c31126v, "bundle");
        C17945a0 m151198e = c31126v.m151198e();
        String mo95039W2 = m151198e.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        if (AbstractC25495a.m132078c(mo95039W2)) {
            if (m151198e.m95276v6()) {
                EnumC31105a m151139t = AbstractC31111g.m151139t(m151198e);
                if (AbstractC26687h.m137065f(mo95039W2, m151198e.m95238r3()) && c31126v.m151199f() == EnumC31127w.f143379p) {
                    switch (a.f143371a[m151139t.ordinal()]) {
                        case 1:
                        case 2:
                            if (m151139t == EnumC31105a.f143335v) {
                                m151193z(c31126v);
                                return;
                            } else {
                                m151186s(c31126v);
                                return;
                            }
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            m151183p(c31126v);
                            return;
                        case 7:
                            m151188u(c31126v);
                            return;
                        default:
                            Runnable m151196c = c31126v.m151196c();
                            if (m151196c != null) {
                                m151196c.run();
                                return;
                            }
                            return;
                    }
                }
                int i11 = a.f143371a[m151139t.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            Runnable m151196c2 = c31126v.m151196c();
                            if (m151196c2 != null) {
                                m151196c2.run();
                                return;
                            }
                            return;
                        }
                        m151191x(c31126v);
                        return;
                    }
                    m151193z(c31126v);
                    return;
                }
                m151186s(c31126v);
                return;
            }
            m151193z(c31126v);
            return;
        }
        m151181n(c31126v);
    }

    /* renamed from: J */
    public static final void m151152J(final C31126v c31126v) {
        String m118743r0;
        String str;
        String str2;
        String m126980e;
        String m126980e2;
        AbstractC19074t.m100208f(c31126v, "bundle");
        C30111x1 m151195b = c31126v.m151195b();
        Resources resources = m151195b.getRoot().getResources();
        C17945a0 m151198e = c31126v.m151198e();
        Context context = m151195b.getRoot().getContext();
        if (!AbstractC19646n0.m103031t1(m151198e.m95041W4()) && !AbstractC19646n0.m102995k1(m151198e.m95041W4())) {
            if (AbstractC19646n0.m102886D1(m151198e.m95041W4())) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_rolled_media_type_video);
            } else if (AbstractC19646n0.m103003m1(m151198e.m95041W4())) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_rolled_media_type_file);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_rolled_media_type_voice);
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_rolled_media_type_photo);
        }
        AbstractC19074t.m100205c(m118743r0);
        ZAppCompatImageView zAppCompatImageView = m151195b.f139868s;
        AbstractC19074t.m100205c(context);
        zAppCompatImageView.setImageDrawable(m151167Y(context));
        RobotoTextView robotoTextView = m151195b.f139874y;
        int i11 = AbstractC8020f0.str_bottom_sheet_zcloud_rolled_media_title;
        Object[] objArr = new Object[1];
        if (m118743r0.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            m126980e2 = AbstractC24319c.m126980e(m118743r0.charAt(0));
            sb2.append((Object) m126980e2);
            String substring = m118743r0.substring(1);
            AbstractC19074t.m100207e(substring, "substring(...)");
            sb2.append(substring);
            str = sb2.toString();
        } else {
            str = m118743r0;
        }
        objArr[0] = str;
        robotoTextView.setText(AbstractC23136l9.m118746s0(i11, objArr));
        RobotoTextView robotoTextView2 = m151195b.f139873x;
        int i12 = AbstractC8020f0.str_bottom_sheet_zcloud_rolled_media_message;
        Object[] objArr2 = new Object[1];
        if (m118743r0.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            m126980e = AbstractC24319c.m126980e(m118743r0.charAt(0));
            sb3.append((Object) m126980e);
            String substring2 = m118743r0.substring(1);
            AbstractC19074t.m100207e(substring2, "substring(...)");
            sb3.append(substring2);
            str2 = sb3.toString();
        } else {
            str2 = m118743r0;
        }
        objArr2[0] = str2;
        robotoTextView2.setText(AbstractC23136l9.m118746s0(i12, objArr2));
        m151195b.f139872w.setVisibility(8);
        if (c31126v.m151199f() == EnumC31127w.f143379p) {
            c31126v.m151195b().f139867r.setVisibility(0);
            m151195b.f139867r.setText(resources.getString(AbstractC8020f0.str_close));
            c31126v.m151195b().f139867r.setOnClickListener(new View.OnClickListener() { // from class: yz.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31125u.m151153K(C31126v.this, view);
                }
            });
        } else {
            c31126v.m151195b().f139867r.setVisibility(8);
        }
        final String m116314f = C21275a.Companion.m110211a().m110204g().m116314f();
        Button button = m151195b.f139866q;
        AbstractC19074t.m100207e(button, "rolledMediaBtnPrimary");
        if (!TextUtils.isEmpty(m116314f)) {
            button.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AbstractC23136l9.m118742r(18.0f);
            button.setOnClickListener(new View.OnClickListener() { // from class: yz.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31125u.m151154L(C31126v.this, m116314f, view);
                }
            });
        }
        m151155M(button, c31126v, true);
        ArrayList arrayList = new ArrayList();
        boolean m95032V6 = m151198e.m95032V6();
        String m94862C4 = m151198e.m94862C4();
        AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
        String m119788L = C23250w4.m119788L(m94862C4, m151198e.m94854B4());
        if (m95032V6) {
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_bottom_sheet_zcloud_rolled_media_hint_ask_owner, m118743r0);
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            arrayList.add(m118746s0);
        } else if (!TextUtils.isEmpty(m119788L)) {
            arrayList.add(m151160R(context, AbstractC8020f0.str_bottom_sheet_zcloud_rolled_media_hint_ask_sender, m119788L, m118743r0));
        }
        String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_bottom_sheet_zcloud_rolled_media_hint_make_sure, m118743r0);
        AbstractC19074t.m100207e(m118746s02, "getString(...)");
        arrayList.add(m118746s02);
        m151145C(context, m151195b, arrayList, true);
        ViewGroup.LayoutParams layoutParams2 = m151195b.f139871v.getLayoutParams();
        AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams2).topMargin = AbstractC23222t7.f112514B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m151153K(C31126v c31126v, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        Runnable m151196c = c31126v.m151196c();
        if (m151196c != null) {
            m151196c.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m151154L(C31126v c31126v, String str, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        AbstractC19074t.m100208f(str, "$learnMoreUrl");
        InterfaceC27218a m151194a = c31126v.m151194a();
        if (m151194a != null) {
            AbstractC23152n3.m119050j0(m151194a.getContext(), str);
        }
    }

    /* renamed from: M */
    private static final void m151155M(TextView textView, C31126v c31126v, boolean z11) {
        String str;
        int m127173b0;
        ImageSpan imageSpan;
        Context context = c31126v.m151195b().getRoot().getContext();
        CharSequence string = context.getString(AbstractC8020f0.str_rolled_media_dialog_learn_more);
        AbstractC19074t.m100207e(string, "getString(...)");
        AbstractC19074t.m100205c(context);
        Drawable m139658a = C27280g.m139658a(context, AbstractC23322a.zds_ic_open_out_app_line_16);
        if (m139658a != null) {
            AbstractC1414a.m7196n(m139658a, textView.getCurrentTextColor());
            int i11 = AbstractC23222t7.f112586t;
            m139658a.setBounds(0, 0, i11, i11);
            if (z11) {
                str = "[[link_icon]] " + context.getString(AbstractC8020f0.str_rolled_media_dialog_learn_more);
            } else {
                str = context.getString(AbstractC8020f0.str_rolled_media_dialog_learn_more) + " [[link_icon]]";
            }
            m127173b0 = AbstractC24342w.m127173b0(str, "[[link_icon]]", 0, false, 6, null);
            int i12 = m127173b0 + 13;
            if (m127173b0 >= 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                if (Build.VERSION.SDK_INT >= 29) {
                    imageSpan = new ImageSpan(m139658a, 2);
                } else {
                    imageSpan = new ImageSpan(m139658a, 0);
                }
                spannableStringBuilder.setSpan(imageSpan, m127173b0, i12, 33);
                textView.setText(spannableStringBuilder);
                return;
            }
            textView.setText(string);
            return;
        }
        textView.setText(string);
    }

    /* renamed from: N */
    static /* synthetic */ void m151156N(TextView textView, C31126v c31126v, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        m151155M(textView, c31126v, z11);
    }

    /* renamed from: O */
    private static final Drawable m151157O() {
        return C23212s8.m119608p(AbstractC16781w.illus_file_expired);
    }

    /* renamed from: P */
    private static final TextView m151158P(Context context, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        int m119607o = C23212s8.m119607o(context, AbstractC2807a.text_02);
        spannableStringBuilder.setSpan(new BulletSpan(context.getResources().getDimensionPixelSize(AbstractC2809c.f11266u3), m119607o), 0, 1, 33);
        RobotoTextView robotoTextView = new RobotoTextView(context, null, AbstractC2814h.t_normal);
        robotoTextView.setTextColor(m119607o);
        int dimensionPixelSize = robotoTextView.getResources().getDimensionPixelSize(AbstractC2809c.f11266u3);
        robotoTextView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        robotoTextView.setText(spannableStringBuilder);
        return robotoTextView;
    }

    /* renamed from: Q */
    private static final TextView m151159Q(Context context, CharSequence charSequence, int i11) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        int m116119a = AbstractC22459a.m116119a(context, AbstractC2807a.text_secondary);
        spannableStringBuilder.setSpan(new C29573b(i11, context.getResources().getDimensionPixelSize(AbstractC2809c.f11266u3), 0, AbstractC23222t7.f112572m, AbstractC22459a.m116119a(context, AbstractC2807a.accent_steel_blue_background_subtle), Integer.valueOf(AbstractC22459a.m116119a(context, AbstractC2807a.text_primary)), Integer.valueOf(AbstractC2814h.t_xxxsmall_m)), 0, 1, 33);
        RobotoTextView robotoTextView = new RobotoTextView(context, null, AbstractC2814h.t_normal);
        robotoTextView.setTextColor(m116119a);
        robotoTextView.setPadding(0, 0, robotoTextView.getResources().getDimensionPixelSize(AbstractC2809c.f11266u3), 0);
        robotoTextView.setText(spannableStringBuilder);
        return robotoTextView;
    }

    /* renamed from: R */
    private static final CharSequence m151160R(Context context, int i11, String str, String str2) {
        String string;
        int m127173b0;
        if (str2 == null) {
            string = context.getString(i11, str);
        } else {
            string = context.getString(i11, str, str2);
        }
        String str3 = string;
        AbstractC19074t.m100205c(str3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        m127173b0 = AbstractC24342w.m127173b0(str3, str, 0, false, 6, null);
        spannableStringBuilder.setSpan(new C29572a(C13718q1.m76694c(context, 9)), m127173b0, str.length() + m127173b0, 33);
        return spannableStringBuilder;
    }

    /* renamed from: S */
    static /* synthetic */ CharSequence m151161S(Context context, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            str2 = null;
        }
        return m151160R(context, i11, str, str2);
    }

    /* renamed from: T */
    private static final Drawable m151162T() {
        return C23212s8.m119608p(AbstractC16781w.illus_my_cloud_file_status_rolled);
    }

    /* renamed from: U */
    public static final C30111x1 m151163U(Context context, FrameLayout frameLayout) {
        FrameLayout.LayoutParams layoutParams;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(frameLayout, "parent");
        C30111x1 m148675c = C30111x1.m148675c(LayoutInflater.from(new ContextThemeWrapper(context, AbstractC8915g0.ThemeDefault_Dark)), frameLayout, true);
        AbstractC19074t.m100207e(m148675c, "inflate(...)");
        ScrollView root = m148675c.getRoot();
        int i11 = AbstractC23222t7.f112534M;
        root.setPadding(i11, 0, i11, 0);
        ViewGroup.LayoutParams layoutParams2 = m148675c.getRoot().getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.gravity = 17;
        }
        m148675c.f139873x.setGravity(1);
        m148675c.f139866q.setIdTracking("rolled_media_btn_primary");
        m148675c.f139867r.setIdTracking("rolled_media_btn_tertiary");
        return m148675c;
    }

    /* renamed from: V */
    public static final String m151164V(Context context, MediaStoreItem mediaStoreItem) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        String mo95039W2 = mediaStoreItem.m40599m().mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        return m151166X(context, mo95039W2, C23250w4.f112644a.m119826N(mediaStoreItem));
    }

    /* renamed from: W */
    public static final String m151165W(Context context, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        return m151166X(context, mo95039W2, c17945a0.m95041W4());
    }

    /* renamed from: X */
    public static final String m151166X(Context context, String str, int i11) {
        String string;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "conversationId");
        if (AbstractC3489d.m17495c(str)) {
            if (AbstractC19646n0.m102886D1(i11)) {
                string = context.getString(AbstractC8020f0.str_rolled_video_cloud);
            } else if (AbstractC19646n0.m103003m1(i11)) {
                string = context.getString(AbstractC8020f0.str_rolled_file_cloud);
            } else {
                string = context.getString(AbstractC8020f0.str_rolled_photo_cloud);
            }
            AbstractC19074t.m100205c(string);
        } else {
            if (AbstractC19646n0.m102886D1(i11)) {
                string = context.getString(AbstractC8020f0.str_rolled_video);
            } else if (AbstractC19646n0.m103003m1(i11)) {
                string = context.getString(AbstractC8020f0.str_rolled_file);
            } else {
                string = context.getString(AbstractC8020f0.str_rolled_photo);
            }
            AbstractC19074t.m100205c(string);
        }
        return string;
    }

    /* renamed from: Y */
    private static final Drawable m151167Y(Context context) {
        return C23212s8.m119609q(context, AbstractC16781w.illus_file_rolled);
    }

    /* renamed from: n */
    private static final void m151181n(final C31126v c31126v) {
        String mo95039W2 = c31126v.m151198e().mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        if (AbstractC3489d.m17495c(mo95039W2) && !c31126v.m151200g()) {
            m151152J(c31126v);
            return;
        }
        C30111x1 m151195b = c31126v.m151195b();
        C17945a0 m151198e = c31126v.m151198e();
        Context context = m151195b.getRoot().getContext();
        Resources resources = context.getResources();
        ArrayList arrayList = new ArrayList();
        boolean m95032V6 = m151198e.m95032V6();
        String m94862C4 = m151198e.m94862C4();
        AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
        String m119788L = C23250w4.m119788L(m94862C4, m151198e.m94854B4());
        int m95041W4 = m151198e.m95041W4();
        if (c31126v.m151200g()) {
            m151195b.f139874y.setText(resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_multimedia_title));
            m151195b.f139873x.setText(resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_multimedia_message));
            if (m95032V6) {
                String string = resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_multimedia_hint_find_elsewhere);
                AbstractC19074t.m100207e(string, "getString(...)");
                arrayList.add(string);
            } else if (!TextUtils.isEmpty(m119788L)) {
                AbstractC19074t.m100205c(context);
                arrayList.add(m151161S(context, AbstractC8020f0.str_bottom_sheet_rolled_multimedia_hint_ask_sender, m119788L, null, 8, null));
            }
        } else if (AbstractC19646n0.m102886D1(m95041W4)) {
            m151195b.f139874y.setText(resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_video_title));
            m151195b.f139873x.setText(resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_video_message));
            if (m95032V6) {
                String string2 = resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_video_hint_find_elsewhere);
                AbstractC19074t.m100207e(string2, "getString(...)");
                arrayList.add(string2);
            } else if (!TextUtils.isEmpty(m119788L)) {
                AbstractC19074t.m100205c(context);
                arrayList.add(m151161S(context, AbstractC8020f0.str_bottom_sheet_rolled_video_hint_ask_sender, m119788L, null, 8, null));
            }
        } else {
            if (AbstractC19646n0.m102995k1(m95041W4) | AbstractC19646n0.m103031t1(m95041W4)) {
                m151195b.f139874y.setText(resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_photo_title));
                m151195b.f139873x.setText(resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_photo_message));
                if (m95032V6) {
                    String string3 = resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_photo_hint_find_elsewhere);
                    AbstractC19074t.m100207e(string3, "getString(...)");
                    arrayList.add(string3);
                } else {
                    if (!TextUtils.isEmpty(m119788L)) {
                        AbstractC19074t.m100205c(context);
                        arrayList.add(m151161S(context, AbstractC8020f0.str_bottom_sheet_rolled_photo_hint_ask_sender, m119788L, null, 8, null));
                    }
                    String string4 = resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_photo_hint_download);
                    AbstractC19074t.m100207e(string4, "getString(...)");
                    arrayList.add(string4);
                }
            } else {
                m151195b.f139874y.setText(resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_file_title));
                m151195b.f139873x.setText(resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_file_message));
                if (m95032V6) {
                    String string5 = resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_file_hint_find_elsewhere);
                    AbstractC19074t.m100207e(string5, "getString(...)");
                    arrayList.add(string5);
                } else {
                    if (!TextUtils.isEmpty(m119788L)) {
                        AbstractC19074t.m100205c(context);
                        arrayList.add(m151161S(context, AbstractC8020f0.str_bottom_sheet_rolled_file_hint_ask_sender, m119788L, null, 8, null));
                    }
                    String string6 = resources.getString(AbstractC8020f0.str_bottom_sheet_rolled_file_hint_download);
                    AbstractC19074t.m100207e(string6, "getString(...)");
                    arrayList.add(string6);
                }
            }
        }
        AbstractC19074t.m100205c(context);
        m151146D(context, m151195b, arrayList, false, 8, null);
        if (c31126v.m151199f() == EnumC31127w.f143380q) {
            m151149G(c31126v);
            return;
        }
        m151147E(c31126v);
        c31126v.m151195b().f139866q.setVisibility(0);
        c31126v.m151195b().f139866q.setOnClickListener(new View.OnClickListener() { // from class: yz.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC31125u.m151182o(C31126v.this, view);
            }
        });
        c31126v.m151195b().f139867r.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m151182o(C31126v c31126v, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        Runnable m151196c = c31126v.m151196c();
        if (m151196c != null) {
            m151196c.run();
        }
    }

    /* renamed from: p */
    private static final void m151183p(final C31126v c31126v) {
        C30111x1 m151195b = c31126v.m151195b();
        Resources resources = m151195b.getRoot().getResources();
        m151195b.f139868s.setImageDrawable(m151157O());
        C26686g m137060a = AbstractC26687h.m137060a("204278670");
        if (m137060a != null) {
            long m137056d = m137060a.m137056d();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(c31126v.m151198e().m94974P4() + m137056d);
            String m119240c0 = AbstractC23160o0.m119240c0(calendar);
            AbstractC19074t.m100207e(m119240c0, "getDdMmYyyySlashStr(...)");
            m151195b.f139874y.setText(resources.getString(AbstractC8020f0.str_msg_file_going_to_expire_bottom_sheet_title, m119240c0));
            m151195b.f139873x.setText(resources.getString(AbstractC8020f0.str_msg_file_going_to_expire_bottom_sheet_desc, AbstractC23041d2.m118215n(m137060a.m137053a()), Long.valueOf(m137060a.m137055c()), AbstractC21935u.m114547n()));
            m151195b.f139871v.setVisibility(8);
            m151195b.f139869t.setVisibility(8);
            m151195b.f139872w.setVisibility(8);
            m151195b.f139866q.setText(resources.getString(AbstractC8020f0.str_msg_file_bottom_sheet_button_download));
            c31126v.m151195b().f139866q.setOnClickListener(new View.OnClickListener() { // from class: yz.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31125u.m151184q(C31126v.this, view);
                }
            });
            m151195b.f139867r.setText(resources.getString(AbstractC8020f0.str_msg_file_bottom_sheet_button_back));
            c31126v.m151195b().f139867r.setOnClickListener(new View.OnClickListener() { // from class: yz.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31125u.m151185r(C31126v.this, view);
                }
            });
            return;
        }
        throw new NullPointerException("File expiration config not found");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m151184q(C31126v c31126v, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        Runnable m151197d = c31126v.m151197d();
        if (m151197d != null) {
            m151197d.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m151185r(C31126v c31126v, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        Runnable m151196c = c31126v.m151196c();
        if (m151196c != null) {
            m151196c.run();
        }
    }

    /* renamed from: s */
    private static final void m151186s(final C31126v c31126v) {
        String string;
        C30111x1 m151195b = c31126v.m151195b();
        C17945a0 m151198e = c31126v.m151198e();
        Resources resources = m151195b.getRoot().getResources();
        m151195b.f139868s.setImageDrawable(m151157O());
        m151195b.f139874y.setText(resources.getString(AbstractC8020f0.str_msg_file_expired_bottom_sheet_title));
        C26686g m137060a = AbstractC26687h.m137060a("204278670");
        if (m137060a != null) {
            long m95238r3 = m151198e.m95238r3();
            RobotoTextView robotoTextView = m151195b.f139873x;
            if (m95238r3 >= m137060a.m137053a()) {
                string = resources.getString(AbstractC8020f0.str_msg_file_expiration_desc, AbstractC23041d2.m118215n(m137060a.m137053a()), Long.valueOf(m137060a.m137055c()), AbstractC21935u.m114547n());
            } else {
                string = resources.getString(AbstractC8020f0.str_msg_file_expiration_desc_short);
            }
            robotoTextView.setText(string);
            m151195b.f139871v.setVisibility(8);
            m151195b.f139869t.setVisibility(8);
            m151195b.f139872w.setVisibility(8);
            if (c31126v.m151199f() == EnumC31127w.f143379p) {
                c31126v.m151195b().f139866q.setVisibility(0);
                c31126v.m151195b().f139866q.setOnClickListener(new View.OnClickListener() { // from class: yz.s
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC31125u.m151187t(C31126v.this, view);
                    }
                });
                c31126v.m151195b().f139867r.setVisibility(8);
                return;
            } else {
                c31126v.m151195b().f139866q.setVisibility(8);
                c31126v.m151195b().f139867r.setVisibility(8);
                return;
            }
        }
        throw new NullPointerException("File expiration config not found");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m151187t(C31126v c31126v, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        Runnable m151196c = c31126v.m151196c();
        if (m151196c != null) {
            m151196c.run();
        }
    }

    /* renamed from: u */
    private static final void m151188u(final C31126v c31126v) {
        C30111x1 m151195b = c31126v.m151195b();
        Resources resources = m151195b.getRoot().getResources();
        m151195b.f139868s.setImageDrawable(m151157O());
        C26686g m137060a = AbstractC26687h.m137060a("204278670");
        if (m137060a != null) {
            if (AbstractC26687h.m137064e(c31126v.m151198e())) {
                m151195b.f139874y.setText(resources.getString(AbstractC8020f0.str_msg_file_downloaded_but_expired_bottom_sheet_title));
                m151195b.f139873x.setText(resources.getString(AbstractC8020f0.str_msg_file_downloaded_but_expired_bottom_sheet_desc, AbstractC23041d2.m118215n(m137060a.m137053a()), Long.valueOf(m137060a.m137055c()), AbstractC21935u.m114547n()));
            } else {
                long m137056d = m137060a.m137056d();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(c31126v.m151198e().m94974P4() + m137056d);
                String m119240c0 = AbstractC23160o0.m119240c0(calendar);
                AbstractC19074t.m100207e(m119240c0, "getDdMmYyyySlashStr(...)");
                m151195b.f139874y.setText(resources.getString(AbstractC8020f0.str_msg_file_going_to_expire_bottom_sheet_title, m119240c0));
                m151195b.f139873x.setText(resources.getString(AbstractC8020f0.str_msg_file_going_to_expire_bottom_sheet_desc_short, AbstractC23041d2.m118215n(m137060a.m137053a()), Long.valueOf(m137060a.m137055c()), AbstractC21935u.m114547n()));
            }
            m151195b.f139871v.setVisibility(8);
            m151195b.f139869t.setVisibility(8);
            m151195b.f139872w.setVisibility(8);
            m151195b.f139866q.setText(resources.getString(AbstractC8020f0.str_msg_file_bottom_sheet_button_open));
            c31126v.m151195b().f139866q.setOnClickListener(new View.OnClickListener() { // from class: yz.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31125u.m151189v(C31126v.this, view);
                }
            });
            m151195b.f139867r.setText(resources.getString(AbstractC8020f0.str_msg_file_bottom_sheet_button_back));
            c31126v.m151195b().f139867r.setOnClickListener(new View.OnClickListener() { // from class: yz.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31125u.m151190w(C31126v.this, view);
                }
            });
            return;
        }
        throw new NullPointerException("File expiration config not found");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m151189v(C31126v c31126v, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        Runnable m151197d = c31126v.m151197d();
        if (m151197d != null) {
            m151197d.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m151190w(C31126v c31126v, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        Runnable m151196c = c31126v.m151196c();
        if (m151196c != null) {
            m151196c.run();
        }
    }

    /* renamed from: x */
    private static final void m151191x(final C31126v c31126v) {
        C30111x1 m151195b = c31126v.m151195b();
        C17945a0 m151198e = c31126v.m151198e();
        Resources resources = m151195b.getRoot().getResources();
        m151195b.f139868s.setImageDrawable(m151157O());
        C26686g m137060a = AbstractC26687h.m137060a("204278670");
        if (m137060a != null) {
            long m137056d = m137060a.m137056d();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(m151198e.m94974P4() + m137056d);
            String m119240c0 = AbstractC23160o0.m119240c0(calendar);
            AbstractC19074t.m100207e(m119240c0, "getDdMmYyyySlashStr(...)");
            m151195b.f139874y.setText(resources.getString(AbstractC8020f0.str_msg_file_going_to_expire_bottom_sheet_title, m119240c0));
            m151195b.f139873x.setText(resources.getString(AbstractC8020f0.str_msg_file_going_to_expire_bottom_sheet_desc, AbstractC23041d2.m118215n(m137060a.m137053a()), Long.valueOf(m137060a.m137055c()), AbstractC21935u.m114547n()));
            m151195b.f139871v.setVisibility(8);
            m151195b.f139869t.setVisibility(8);
            m151195b.f139872w.setVisibility(8);
            if (c31126v.m151199f() == EnumC31127w.f143379p) {
                c31126v.m151195b().f139866q.setVisibility(0);
                c31126v.m151195b().f139866q.setOnClickListener(new View.OnClickListener() { // from class: yz.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC31125u.m151192y(C31126v.this, view);
                    }
                });
                c31126v.m151195b().f139867r.setVisibility(8);
                return;
            } else {
                c31126v.m151195b().f139866q.setVisibility(8);
                c31126v.m151195b().f139867r.setVisibility(8);
                return;
            }
        }
        throw new NullPointerException("File expiration config not found");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m151192y(C31126v c31126v, View view) {
        AbstractC19074t.m100208f(c31126v, "$bundle");
        Runnable m151196c = c31126v.m151196c();
        if (m151196c != null) {
            m151196c.run();
        }
    }

    /* renamed from: z */
    private static final void m151193z(final C31126v c31126v) {
        String mo95039W2 = c31126v.m151198e().mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        if (AbstractC3489d.m17495c(mo95039W2) && !c31126v.m151200g()) {
            m151152J(c31126v);
            return;
        }
        C30111x1 m151195b = c31126v.m151195b();
        Resources resources = m151195b.getRoot().getResources();
        m151195b.f139868s.setImageDrawable(m151162T());
        m151195b.f139874y.setText(resources.getString(AbstractC8020f0.str_outcloud_status_bottom_sheet_title));
        m151195b.f139873x.setText(resources.getString(AbstractC8020f0.str_outcloud_status_bottom_sheet_body));
        m151195b.f139871v.setVisibility(8);
        m151195b.f139869t.setVisibility(8);
        if (c31126v.m151199f() == EnumC31127w.f143379p) {
            c31126v.m151195b().f139866q.setVisibility(0);
            c31126v.m151195b().f139866q.setOnClickListener(new View.OnClickListener() { // from class: yz.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31125u.m151143A(C31126v.this, view);
                }
            });
            c31126v.m151195b().f139867r.setVisibility(8);
        } else {
            c31126v.m151195b().f139866q.setVisibility(8);
            c31126v.m151195b().f139867r.setVisibility(8);
        }
        final String str = C21275a.Companion.m110211a().m110204g().f110057K;
        RobotoTextView robotoTextView = m151195b.f139872w;
        AbstractC19074t.m100207e(robotoTextView, "rolledMediaTvLearnMore");
        if (!TextUtils.isEmpty(str)) {
            robotoTextView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = robotoTextView.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AbstractC23136l9.m118742r(18.0f);
            robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: yz.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC31125u.m151144B(C31126v.this, str, view);
                }
            });
        }
        m151156N(robotoTextView, c31126v, false, 4, null);
    }
}
