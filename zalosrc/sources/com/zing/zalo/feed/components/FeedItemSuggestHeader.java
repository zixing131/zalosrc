package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3047v0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.InterfaceC10867f;
import is.AbstractC20814p0;
import p354n3.C23528a;
import p604wb.C28905e;

/* loaded from: classes4.dex */
public class FeedItemSuggestHeader extends RelativeLayout {

    /* renamed from: A */
    protected int f44784A;

    /* renamed from: p */
    protected ImageView f44785p;

    /* renamed from: q */
    protected RobotoTextView f44786q;

    /* renamed from: r */
    protected RobotoTextView f44787r;

    /* renamed from: s */
    protected RobotoTextView f44788s;

    /* renamed from: t */
    protected RobotoTextView f44789t;

    /* renamed from: u */
    private ImageButton f44790u;

    /* renamed from: v */
    private ImageView f44791v;

    /* renamed from: w */
    private View f44792w;

    /* renamed from: x */
    private View f44793x;

    /* renamed from: y */
    protected RobotoTextView f44794y;

    /* renamed from: z */
    protected C23528a f44795z;

    public FeedItemSuggestHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void m44136a(Context context, int i11) {
        this.f44795z = new C23528a(context);
        this.f44784A = i11;
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.feed_item_suggest_header_content, this);
            this.f44785p = (ImageView) findViewById(AbstractC6918a0.imvAvatar);
            this.f44786q = (RobotoTextView) findViewById(AbstractC6918a0.tvUserName);
            this.f44790u = (ImageButton) findViewById(AbstractC6918a0.btn_submenu_feed_ads);
            this.f44788s = (RobotoTextView) findViewById(AbstractC6918a0.tvAdsLocation);
            this.f44787r = (RobotoTextView) findViewById(AbstractC6918a0.tv_suggest_header);
            this.f44792w = findViewById(AbstractC6918a0.divider_suggest_header);
            this.f44789t = (RobotoTextView) findViewById(AbstractC6918a0.tv_suggest_header_tag);
            this.f44793x = findViewById(AbstractC6918a0.divider_suggest_tag);
            this.f44794y = (RobotoTextView) findViewById(AbstractC6918a0.tvMessage);
            this.f44791v = (ImageView) findViewById(AbstractC6918a0.imv_certificate);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:3:0x0001, B:7:0x0014, B:11:0x0023, B:12:0x0083, B:14:0x0087, B:16:0x008d, B:17:0x0091, B:18:0x0094, B:20:0x0098, B:22:0x009c, B:24:0x00a4, B:26:0x00aa, B:28:0x00b0, B:32:0x0040, B:35:0x004e, B:37:0x0059, B:38:0x007c, B:39:0x006b), top: B:2:0x0001 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m44137b(C3000l0 c3000l0, int i11, boolean z11, InterfaceC10867f interfaceC10867f) {
        int i12;
        RobotoTextView robotoTextView;
        C3047v0 c3047v0;
        try {
            AbstractC20814p0.m108651j0(c3000l0, i11, null, this.f44786q, this.f44785p, null, z11, this.f44795z, interfaceC10867f, this.f44784A);
            if (c3000l0 == null) {
                return;
            }
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            int i13 = this.f44784A;
            if (i13 != 1 && i13 != 0) {
                this.f44790u.setVisibility(8);
                this.f44787r.setVisibility(8);
                this.f44792w.setVisibility(8);
                this.f44789t.setVisibility(8);
                this.f44793x.setVisibility(8);
                robotoTextView = this.f44788s;
                if (robotoTextView != null) {
                    if (m14324b0.f12023C.f12111b != null) {
                        robotoTextView.setVisibility(0);
                    } else {
                        robotoTextView.setVisibility(8);
                    }
                }
                if (this.f44791v == null && (c3047v0 = m14324b0.f12022B) != null) {
                    int i14 = c3047v0.f12279a;
                    if (ContactProfile.m40347T0(i14) && ContactProfile.m40345C0(i14)) {
                        this.f44791v.setVisibility(0);
                        return;
                    } else {
                        this.f44791v.setVisibility(8);
                        return;
                    }
                }
            }
            ImageButton imageButton = this.f44790u;
            if (C28905e.f133812l == 1) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageButton.setVisibility(i12);
            if (!TextUtils.isEmpty(m14324b0.f12061t)) {
                this.f44787r.setVisibility(0);
                this.f44792w.setVisibility(0);
                this.f44787r.setText(m14324b0.f12061t);
            } else {
                this.f44787r.setText("");
                this.f44787r.setVisibility(8);
                this.f44792w.setVisibility(8);
            }
            AbstractC20814p0.m108610I0(c3000l0, i11, this.f44789t, this.f44793x, interfaceC10867f);
            robotoTextView = this.f44788s;
            if (robotoTextView != null) {
            }
            if (this.f44791v == null) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m44138c(Context context, C3000l0 c3000l0, int i11, InterfaceC10867f interfaceC10867f) {
        boolean z11;
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            RobotoTextView robotoTextView = this.f44794y;
            int i12 = this.f44784A;
            boolean z12 = true;
            if (i12 != 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i12 != 0) {
                z12 = false;
            }
            AbstractC20814p0.m108675v0(m14324b0, robotoTextView, z11, z12, context, interfaceC10867f);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setOnFeedMenuClickListener(View.OnClickListener onClickListener) {
        ImageButton imageButton = this.f44790u;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public void setOnProfileClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f44785p;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        RobotoTextView robotoTextView = this.f44786q;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(onClickListener);
        }
    }

    public void setOnSuggestLocationClickListener(View.OnClickListener onClickListener) {
        RobotoTextView robotoTextView = this.f44788s;
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(onClickListener);
        }
    }

    public FeedItemSuggestHeader(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
