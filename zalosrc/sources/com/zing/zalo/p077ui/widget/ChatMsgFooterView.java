package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.social.controls.C10883v;
import dj.C17945a0;
import ho0.AbstractC20110a;
import ib0.C20497a;
import me0.AbstractC23118k2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p542ub.InterfaceC27218a;
import p716zh.C32012m;

/* loaded from: classes6.dex */
public class ChatMsgFooterView extends RelativeLayout {

    /* renamed from: p */
    private TextView f69040p;

    /* renamed from: q */
    private View f69041q;

    /* renamed from: r */
    private View f69042r;

    public ChatMsgFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m75618c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m75616d(C17945a0 c17945a0, View view) {
        try {
            if (view.getContext() == null) {
                return;
            }
            AbstractC23118k2.m118601n(view.getContext(), c17945a0.m94912I2().f147323q);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    public void m75617b(final C17945a0 c17945a0, InterfaceC27218a interfaceC27218a) {
        try {
            if (c17945a0.m94912I2() != null && c17945a0.m94912I2().f147323q != 0 && !TextUtils.isEmpty(c17945a0.m94912I2().f147324r)) {
                this.f69042r.setVisibility(0);
                m75619e(c17945a0, c17945a0.m94912I2(), interfaceC27218a);
                this.f69041q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ChatMsgFooterView.m75616d(C17945a0.this, view);
                    }
                });
            }
            this.f69042r.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m75618c() {
        try {
            this.f69042r = findViewById(AbstractC6918a0.chat_footer_container_layout);
            this.f69040p = (TextView) findViewById(AbstractC6918a0.chat_footer_text);
            this.f69041q = findViewById(AbstractC6918a0.chat_footer_action_view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:3:0x0004, B:7:0x0033, B:9:0x003c, B:10:0x003e, B:12:0x0074, B:14:0x0077, B:16:0x0089, B:18:0x00db, B:23:0x00e1, B:35:0x0029), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:3:0x0004, B:7:0x0033, B:9:0x003c, B:10:0x003e, B:12:0x0074, B:14:0x0077, B:16:0x0089, B:18:0x00db, B:23:0x00e1, B:35:0x0029), top: B:2:0x0004 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m75619e(C17945a0 c17945a0, C32012m c32012m, InterfaceC27218a interfaceC27218a) {
        String str;
        String str2;
        String str3;
        int i11;
        Object[] spans;
        Spanned spanned;
        try {
            String str4 = c32012m.f147324r;
            String str5 = "";
            String str6 = null;
            if (c32012m.f147326t == 3) {
                try {
                    JSONObject jSONObject = new JSONObject(c32012m.f147325s);
                    str = jSONObject.optString("pkgname");
                    try {
                        str6 = jSONObject.optString("appReferrer");
                    } catch (Exception e11) {
                        e = e11;
                        AbstractC23350e.m122776f("", e);
                        str2 = str;
                        str3 = str6;
                        String str7 = c32012m.f147324r;
                        long j11 = c32012m.f147323q;
                        i11 = c32012m.f147326t;
                        if (i11 == 2) {
                        }
                        Spanned fromHtml = Html.fromHtml(C10883v.m56526j0(str7, j11, i11, str5, c17945a0.m95029V3().m41044h(), c17945a0.m94862C4(), "2", str3, str2));
                        SpannableString spannableString = new SpannableString(fromHtml.toString());
                        int i12 = 0;
                        spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
                        int m40666e = TrackingSource.m40666e();
                        String m40669h = TrackingSource.m40669h(m40666e);
                        if (spans.length > 0) {
                        }
                        this.f69040p.setText(str4);
                        this.f69040p.setMovementMethod(C20497a.m106532c());
                    }
                } catch (Exception e12) {
                    e = e12;
                    str = null;
                }
                str2 = str;
                str3 = str6;
            } else {
                str3 = null;
                str2 = null;
            }
            String str72 = c32012m.f147324r;
            long j112 = c32012m.f147323q;
            i11 = c32012m.f147326t;
            if (i11 == 2) {
                str5 = c32012m.f147325s;
            }
            Spanned fromHtml2 = Html.fromHtml(C10883v.m56526j0(str72, j112, i11, str5, c17945a0.m95029V3().m41044h(), c17945a0.m94862C4(), "2", str3, str2));
            SpannableString spannableString2 = new SpannableString(fromHtml2.toString());
            int i122 = 0;
            spans = fromHtml2.getSpans(0, fromHtml2.length(), Object.class);
            int m40666e2 = TrackingSource.m40666e();
            String m40669h2 = TrackingSource.m40669h(m40666e2);
            if (spans.length > 0) {
                int length = spans.length;
                while (i122 < length) {
                    Object obj = spans[i122];
                    int spanStart = fromHtml2.getSpanStart(obj);
                    int spanEnd = fromHtml2.getSpanEnd(obj);
                    int spanFlags = fromHtml2.getSpanFlags(obj);
                    if (obj instanceof URLSpan) {
                        spanned = fromHtml2;
                        C10883v c10883v = new C10883v(getContext(), ((URLSpan) obj).getURL(), spanStart, spanEnd, 81, c17945a0.m95029V3().m41046j(), c17945a0.m94862C4(), m40666e2, m40669h2);
                        c10883v.m56376T(getResources().getColor(AbstractC16801x.primary_desc_color));
                        c10883v.m56365I(interfaceC27218a);
                        spannableString2.setSpan(c10883v, spanStart, spanEnd, spanFlags);
                    } else {
                        spanned = fromHtml2;
                    }
                    i122++;
                    fromHtml2 = spanned;
                }
                str4 = spannableString2;
            }
            this.f69040p.setText(str4);
            this.f69040p.setMovementMethod(C20497a.m106532c());
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m75618c();
    }
}
