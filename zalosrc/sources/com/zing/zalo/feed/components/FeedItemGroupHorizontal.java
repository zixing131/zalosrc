package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ao.InterfaceC2259a;
import ao.InterfaceC2262d;
import au.C2370r0;
import bi0.AbstractC2807a;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.uicontrols.FeedGroupViewPager;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.social.controls.InterfaceC10867f;
import hf0.C20047i;
import ho0.AbstractC20110a;
import is.AbstractC20814p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p022ap.C2270a;
import p262jb.AbstractC21196a;
import p304ks.AbstractC21935u;
import p354n3.C23528a;
import p398oo.C24380u;
import p489rn.AbstractC25881j;
import p489rn.C25897n0;
import ui0.C27280g;

/* loaded from: classes4.dex */
public class FeedItemGroupHorizontal extends RelativeLayout {

    /* renamed from: A */
    private TextView f44395A;

    /* renamed from: B */
    private C25897n0 f44396B;

    /* renamed from: C */
    private FeedGroupViewPager f44397C;

    /* renamed from: D */
    private C23528a f44398D;

    /* renamed from: E */
    private int f44399E;

    /* renamed from: F */
    private InterfaceC2262d f44400F;

    /* renamed from: G */
    public AbstractC22055v0.l f44401G;

    /* renamed from: p */
    public int f44402p;

    /* renamed from: q */
    public int f44403q;

    /* renamed from: r */
    private InterfaceC10867f f44404r;

    /* renamed from: s */
    private InterfaceC2259a f44405s;

    /* renamed from: t */
    private ImageView f44406t;

    /* renamed from: u */
    private RobotoTextView f44407u;

    /* renamed from: v */
    private RobotoTextView f44408v;

    /* renamed from: w */
    private RelativeLayout f44409w;

    /* renamed from: x */
    private RelativeLayout f44410x;

    /* renamed from: y */
    private AspectRatioImageView f44411y;

    /* renamed from: z */
    private RobotoTextView f44412z;

    public FeedItemGroupHorizontal(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44402p = 0;
        this.f44403q = 0;
    }

    /* renamed from: b */
    private void m43749b(C3000l0 c3000l0, int i11) {
        if (this.f44410x != null && c3000l0 != null && c3000l0.m14324b0(i11) != null) {
            if (C24380u.f117739a.m127515h() && c3000l0.m14287D0() && !c3000l0.m14324b0(i11).m14494Y()) {
                this.f44410x.setVisibility(0);
                this.f44410x.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.n1

                    /* renamed from: q */
                    public final /* synthetic */ C3000l0 f45528q;

                    /* renamed from: r */
                    public final /* synthetic */ int f45529r;

                    public /* synthetic */ ViewOnClickListenerC8339n1(C3000l0 c3000l02, int i112) {
                        r2 = c3000l02;
                        r3 = i112;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FeedItemGroupHorizontal.this.m43750d(r2, r3, view);
                    }
                });
            } else {
                this.f44410x.setVisibility(8);
            }
        }
    }

    /* renamed from: d */
    public /* synthetic */ void m43750d(C3000l0 c3000l0, int i11, View view) {
        InterfaceC2259a interfaceC2259a = this.f44405s;
        if (interfaceC2259a != null && (interfaceC2259a instanceof AbstractC25881j.b)) {
            ((AbstractC25881j.b) interfaceC2259a).mo14631rG(new C2270a(c3000l0, c3000l0.m14324b0(i11)));
        }
    }

    /* renamed from: c */
    public void m43751c(Context context, int i11) {
        this.f44399E = i11;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        int i12 = this.f44399E;
        if (i12 == 0) {
            layoutInflater.inflate(AbstractC7409c0.feed_item_group_horizontal_content, this);
        } else if (i12 == 1) {
            layoutInflater.inflate(AbstractC7409c0.feed_item_group_horizontal_game_content, this);
            this.f44412z = (RobotoTextView) findViewById(AbstractC6918a0.tvGameTitle);
        } else if (i12 == 2) {
            layoutInflater.inflate(AbstractC7409c0.feed_item_group_horizontal_suggest_content, this);
            this.f44395A = (TextView) findViewById(AbstractC6918a0.tvSuggestedTitle);
        }
        int m118712h = AbstractC23136l9.m118712h(context, 40.0f);
        this.f44402p = m118712h;
        this.f44403q = (m118712h * 2) - AbstractC23136l9.m118712h(context, 8.0f);
        this.f44406t = (ImageView) findViewById(AbstractC6918a0.imvAvatar);
        this.f44407u = (RobotoTextView) findViewById(AbstractC6918a0.tvUserName);
        this.f44408v = (RobotoTextView) findViewById(AbstractC6918a0.tvMessage);
        this.f44409w = (RelativeLayout) findViewById(AbstractC6918a0.btn_submenu_feed);
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) findViewById(AbstractC6918a0.ic_submenu_feed);
        this.f44411y = aspectRatioImageView;
        aspectRatioImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_more_horizontal_line_24, AbstractC2807a.icon_02));
        this.f44410x = (RelativeLayout) findViewById(AbstractC6918a0.btn_move_tab);
        AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) findViewById(AbstractC6918a0.ic_move_tab);
        this.f44411y = aspectRatioImageView2;
        aspectRatioImageView2.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_posts_move_line_24, AbstractC2807a.icon_02));
        FeedGroupViewPager feedGroupViewPager = (FeedGroupViewPager) findViewById(AbstractC6918a0.vpager);
        this.f44397C = feedGroupViewPager;
        feedGroupViewPager.setOffscreenPageLimit(1);
        this.f44397C.setPageMargin(-this.f44403q);
        this.f44397C.setClipChildren(false);
        this.f44397C.setClipToPadding(false);
        this.f44398D = new C23528a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m43752e(C2370r0 c2370r0, Context context, C3000l0 c3000l0, boolean z11, HashMap hashMap, int i11) {
        List list;
        FeedGroupViewPager feedGroupViewPager;
        boolean z12;
        if (c3000l0 != null && (list = c3000l0.f11899s) != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList(c3000l0.f11899s);
            boolean[] zArr = null;
            try {
                int i12 = 0;
                if (hashMap.containsKey(c3000l0.f11895q)) {
                    boolean[] zArr2 = (boolean[]) hashMap.get(c3000l0.f11895q);
                    if (zArr2 != null) {
                        try {
                            if (zArr2.length == arrayList.size()) {
                                zArr = zArr2;
                                z12 = false;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            zArr = zArr2;
                            AbstractC20110a.m104539h(e);
                            boolean[] zArr3 = zArr;
                            FeedGroupViewPager feedGroupViewPager2 = this.f44397C;
                            C25897n0 c25897n0 = new C25897n0(c2370r0, context, feedGroupViewPager2.f47335q, feedGroupViewPager2.f47334p, zArr3);
                            this.f44396B = c25897n0;
                            c25897n0.f123544I = this.f44401G;
                            c25897n0.m133579b0(this.f44405s);
                            this.f44396B.m133577Z(this.f44404r);
                            this.f44396B.m133580c0(this.f44400F);
                            this.f44396B.m133578a0(c3000l0, arrayList);
                            this.f44396B.m133581d0(z11);
                            feedGroupViewPager = this.f44397C;
                            if (feedGroupViewPager == null) {
                            }
                        }
                    }
                    zArr = new boolean[arrayList.size()];
                    z12 = false;
                } else {
                    zArr = new boolean[arrayList.size()];
                    z12 = true;
                }
                hashMap.put(c3000l0.f11895q, zArr);
                if (!z11 || !z12) {
                    if (i11 > 0) {
                        if (i11 > zArr.length) {
                            i11 = zArr.length;
                        }
                        int i13 = i11 - 1;
                        if (i13 >= 0) {
                            i12 = i13;
                        }
                        zArr[i12] = true;
                    }
                    if (i11 < zArr.length - 1) {
                        zArr[i11 + 1] = true;
                    }
                }
                if (i11 >= 0 && i11 < zArr.length) {
                    zArr[i11] = true;
                }
            } catch (Exception e12) {
                e = e12;
            }
            boolean[] zArr32 = zArr;
            FeedGroupViewPager feedGroupViewPager22 = this.f44397C;
            C25897n0 c25897n02 = new C25897n0(c2370r0, context, feedGroupViewPager22.f47335q, feedGroupViewPager22.f47334p, zArr32);
            this.f44396B = c25897n02;
            c25897n02.f123544I = this.f44401G;
            c25897n02.m133579b0(this.f44405s);
            this.f44396B.m133577Z(this.f44404r);
            this.f44396B.m133580c0(this.f44400F);
            this.f44396B.m133578a0(c3000l0, arrayList);
            this.f44396B.m133581d0(z11);
            feedGroupViewPager = this.f44397C;
            if (feedGroupViewPager == null) {
                feedGroupViewPager.getLayoutParams().height = (int) c3000l0.f11859H;
                this.f44397C.setAdapter(this.f44396B);
            }
        }
    }

    /* renamed from: f */
    public void m43753f(C3000l0 c3000l0, int i11, boolean z11, InterfaceC10867f interfaceC10867f) {
        AbstractC20814p0.m108651j0(c3000l0, i11, this.f44409w, this.f44407u, this.f44406t, null, z11, this.f44398D, interfaceC10867f, this.f44399E);
        m43749b(c3000l0, i11);
    }

    /* renamed from: g */
    public void m43754g(C3000l0 c3000l0, InterfaceC10867f interfaceC10867f) {
        C3020p0 m14322a0;
        String str;
        if (c3000l0 != null && (m14322a0 = c3000l0.m14322a0()) != null) {
            String format = String.format("<a href=\"zm://ProfileBold/%s\">%s</a>", m14322a0.m14465A(), AbstractC21935u.m114542i(m14322a0.m14465A(), m14322a0.f12022B.f12282d));
            if (c3000l0.f11851A != null) {
                str = format + " " + c3000l0.f11851A.f11958c.toString().trim();
            } else {
                str = format + " " + String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_group_title), Integer.valueOf(c3000l0.f11899s.size()));
            }
            Spanned fromHtml = Html.fromHtml(str);
            SpannableString spannableString = new SpannableString(fromHtml.toString());
            for (Object obj : fromHtml.getSpans(0, fromHtml.length(), Object.class)) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                int spanFlags = fromHtml.getSpanFlags(obj);
                if (obj instanceof URLSpan) {
                    C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                    c10866e.m56375S(true);
                    c10866e.f54832J = 10;
                    c10866e.m56369M(interfaceC10867f);
                    c10866e.m56377U(C23212s8.m119607o(this.f44408v.getContext(), AbstractC21196a.TextColor1));
                    spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                }
            }
            this.f44408v.setText(spannableString);
            this.f44408v.setMovementMethod(CustomMovementMethod.m56305e());
        }
    }

    public FeedGroupViewPager getPager() {
        return this.f44397C;
    }

    public void setAutoPlayerManager(C20047i c20047i) {
        C25897n0 c25897n0 = this.f44396B;
        if (c25897n0 != null) {
            c25897n0.m133576Y(c20047i);
        }
    }

    public void setCallbackSpanListener(InterfaceC10867f interfaceC10867f) {
        this.f44404r = interfaceC10867f;
    }

    public void setFeedCallback(InterfaceC2259a interfaceC2259a) {
        this.f44405s = interfaceC2259a;
    }

    public void setMenuClickListener(InterfaceC2262d interfaceC2262d) {
        this.f44400F = interfaceC2262d;
    }

    public void setOnFeedMenuClickListener(View.OnClickListener onClickListener) {
        RelativeLayout relativeLayout = this.f44409w;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(onClickListener);
        }
    }

    public void setOnProfileClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f44406t;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        RobotoTextView robotoTextView = this.f44407u;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(onClickListener);
        }
    }

    public void setSuggestedData(C3000l0 c3000l0) {
        TextView textView;
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(0);
            if (m14324b0 != null && (textView = this.f44395A) != null) {
                textView.setText(m14324b0.f12061t);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
