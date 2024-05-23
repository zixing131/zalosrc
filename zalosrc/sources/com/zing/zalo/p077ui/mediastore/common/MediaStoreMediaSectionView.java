package com.zing.zalo.p077ui.mediastore.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import ci.C3503g0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import p227i3.C20218v;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public final class MediaStoreMediaSectionView extends LinearLayout implements View.OnClickListener {

    /* renamed from: p */
    private RelativeLayout f64261p;

    /* renamed from: q */
    private View f64262q;

    /* renamed from: r */
    private RobotoTextView f64263r;

    /* renamed from: s */
    private RobotoTextView f64264s;

    /* renamed from: t */
    private RobotoTextView f64265t;

    /* renamed from: u */
    private ImageView f64266u;

    /* renamed from: v */
    private C3503g0 f64267v;

    /* renamed from: w */
    private View f64268w;

    /* renamed from: x */
    private InterfaceC12356a f64269x;

    /* renamed from: com.zing.zalo.ui.mediastore.common.MediaStoreMediaSectionView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12356a {
        /* renamed from: a */
        void mo36866a(C3503g0 c3503g0);

        /* renamed from: b */
        void mo36867b(C3503g0 c3503g0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreMediaSectionView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m69473a(context);
    }

    /* renamed from: a */
    public final void m69473a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        setOrientation(1);
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(AbstractC7409c0.layout_media_store_media_section, this);
        this.f64261p = (RelativeLayout) findViewById(AbstractC6918a0.media_store_media_section_content);
        this.f64262q = findViewById(AbstractC6918a0.ll_section_title_area);
        this.f64263r = (RobotoTextView) findViewById(AbstractC6918a0.tv_section_title);
        this.f64264s = (RobotoTextView) findViewById(AbstractC6918a0.tv_section_subtitle);
        this.f64265t = (RobotoTextView) findViewById(AbstractC6918a0.tv_right_side);
        this.f64268w = findViewById(AbstractC6918a0.icn_section_red_dot);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:            if (r7.m17669c() != false) goto L30;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011b  */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View$OnClickListener, android.view.View, com.zing.zalo.ui.mediastore.common.MediaStoreMediaSectionView, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m69474b(C3503g0 c3503g0, boolean z11) {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z12;
        C3503g0 c3503g02;
        View view;
        RobotoTextView robotoTextView;
        RobotoTextView robotoTextView2;
        View view2;
        int i11;
        float f11;
        int i12;
        float f12;
        ?? m17671e;
        this.f64267v = c3503g0;
        String str = "";
        if (c3503g0 == null || (charSequence = c3503g0.m17673g()) == null) {
            charSequence = "";
        }
        C3503g0 c3503g03 = this.f64267v;
        if (c3503g03 == null || (charSequence2 = c3503g03.m17672f()) == null) {
            charSequence2 = "";
        }
        C3503g0 c3503g04 = this.f64267v;
        if (c3503g04 != null && (m17671e = c3503g04.m17671e()) != 0) {
            str = m17671e;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        C3503g0 c3503g05 = this.f64267v;
        boolean z13 = true;
        int i13 = 0;
        if (c3503g05 != null) {
            AbstractC19074t.m100205c(c3503g05);
            if (c3503g05.m17668b()) {
                z12 = true;
                c3503g02 = this.f64267v;
                if (c3503g02 != null) {
                    AbstractC19074t.m100205c(c3503g02);
                }
                z13 = false;
                view = this.f64262q;
                if (view != null) {
                    view.setOnClickListener(this);
                    view.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
                    view.setEnabled(z11);
                }
                robotoTextView = this.f64263r;
                float f13 = 1.0f;
                if (robotoTextView != null) {
                    robotoTextView.setText(charSequence);
                    if (z12) {
                        i12 = AbstractC16803z.icn_form_dropdown;
                    } else {
                        i12 = 0;
                    }
                    robotoTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i12, 0);
                    if (!z11) {
                        f12 = 0.3f;
                    } else {
                        f12 = 1.0f;
                    }
                    setAlpha(f12);
                }
                robotoTextView2 = this.f64264s;
                if (robotoTextView2 != null) {
                    robotoTextView2.setText(charSequence2);
                    if (TextUtils.isEmpty(charSequence2)) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    robotoTextView2.setVisibility(i11);
                    robotoTextView2.setEnabled(z11);
                    if (!z11) {
                        f11 = 0.3f;
                    } else {
                        f11 = 1.0f;
                    }
                    setAlpha(f11);
                }
                if (!isEmpty) {
                    RobotoTextView robotoTextView3 = this.f64265t;
                    if (robotoTextView3 != null) {
                        robotoTextView3.setVisibility(8);
                    }
                    if (c3503g0 != null && c3503g0.m17667a() != 0) {
                        if (this.f64266u == null) {
                            View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.layout_media_store_icon_photo_layout_mode, (ViewGroup) this.f64261p, false);
                            AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                            this.f64266u = (ImageView) inflate;
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, AbstractC32232i.m155453a(48.0f));
                            layoutParams.rightMargin = AbstractC32232i.m155453a(12.0f);
                            layoutParams.addRule(11);
                            layoutParams.addRule(15);
                            ImageView imageView = this.f64266u;
                            if (imageView != null) {
                                imageView.setPadding(0, 0, 0, 0);
                                addView(this.f64266u, layoutParams);
                                imageView.setOnClickListener(this);
                            }
                        }
                        ImageView imageView2 = this.f64266u;
                        if (imageView2 != null) {
                            imageView2.setVisibility(0);
                            imageView2.setImageResource(c3503g0.m17667a());
                            imageView2.setEnabled(z11);
                            if (!z11) {
                                f13 = 0.3f;
                            }
                            imageView2.setAlpha(f13);
                        }
                    } else {
                        ImageView imageView3 = this.f64266u;
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                        }
                    }
                } else {
                    RobotoTextView robotoTextView4 = this.f64265t;
                    if (robotoTextView4 != null) {
                        robotoTextView4.setVisibility(0);
                        if (!z11) {
                            f13 = 0.3f;
                        }
                        robotoTextView4.setAlpha(f13);
                        if (c3503g0 != null) {
                            robotoTextView4.setCompoundDrawablesWithIntrinsicBounds(c3503g0.m17667a(), 0, 0, 0);
                        }
                        robotoTextView4.setText(str);
                        robotoTextView4.setOnClickListener(this);
                        robotoTextView4.setEnabled(z11);
                    }
                }
                view2 = this.f64268w;
                if (view2 == null) {
                    if (!z13) {
                        i13 = 8;
                    }
                    view2.setVisibility(i13);
                    return;
                }
                return;
            }
        }
        z12 = false;
        c3503g02 = this.f64267v;
        if (c3503g02 != null) {
        }
        z13 = false;
        view = this.f64262q;
        if (view != null) {
        }
        robotoTextView = this.f64263r;
        float f132 = 1.0f;
        if (robotoTextView != null) {
        }
        robotoTextView2 = this.f64264s;
        if (robotoTextView2 != null) {
        }
        if (!isEmpty) {
        }
        view2 = this.f64268w;
        if (view2 == null) {
        }
    }

    public final InterfaceC12356a getMListener() {
        return this.f64269x;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC12356a interfaceC12356a;
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tv_right_side) {
            InterfaceC12356a interfaceC12356a2 = this.f64269x;
            if (interfaceC12356a2 != null) {
                interfaceC12356a2.mo36867b(this.f64267v);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.ll_section_title_area && (interfaceC12356a = this.f64269x) != null) {
            interfaceC12356a.mo36866a(this.f64267v);
        }
    }

    public final void setMListener(InterfaceC12356a interfaceC12356a) {
        this.f64269x = interfaceC12356a;
    }

    public final void setSectionListener(InterfaceC12356a interfaceC12356a) {
        this.f64269x = interfaceC12356a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreMediaSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m69473a(context);
    }
}
