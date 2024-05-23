package com.zing.zalo.p077ui.custom;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.CustomMovementMethod;
import me0.AbstractC23136l9;
import me0.C23212s8;
import nb0.C23670a;

/* loaded from: classes5.dex */
public class ActionTitleDialog extends LinearLayout {

    /* renamed from: p */
    RobotoTextView f61630p;

    /* renamed from: com.zing.zalo.ui.custom.ActionTitleDialog$a */
    /* loaded from: classes5.dex */
    public static class C11841a implements C10866e.a {

        /* renamed from: a */
        String f61631a;

        /* renamed from: b */
        int f61632b;

        /* renamed from: c */
        int f61633c;

        /* renamed from: d */
        Context f61634d;

        /* renamed from: e */
        InterfaceC11842b f61635e;

        public C11841a(Context context, int i11, String str, int i12, InterfaceC11842b interfaceC11842b) {
            this.f61634d = context;
            this.f61633c = i11;
            this.f61631a = str;
            this.f61632b = i12;
            this.f61635e = interfaceC11842b;
        }

        @Override // com.zing.zalo.social.controls.C10866e.a
        /* renamed from: a */
        public void mo44545a(int i11) {
            InterfaceC11842b interfaceC11842b = this.f61635e;
            if (interfaceC11842b != null && i11 == 109) {
                interfaceC11842b.mo65816I9(this.f61633c);
            }
        }

        /* renamed from: b */
        public ActionTitleDialog m65815b() {
            ActionTitleDialog actionTitleDialog = new ActionTitleDialog(this.f61634d);
            int m118676S0 = AbstractC23136l9.m118676S0(actionTitleDialog.f61630p, (int) actionTitleDialog.f61630p.getPaint().measureText("Aa"), "Aa");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f61631a).append((CharSequence) " ");
            int i11 = this.f61632b;
            if (i11 != 0) {
                Drawable m118665N = AbstractC23136l9.m118665N(this.f61634d, i11);
                m118665N.setBounds(0, 0, m118676S0, m118676S0);
                C23670a c23670a = new C23670a(m118665N, 1);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                C10866e c10866e = new C10866e("zm://ImageAction", length, length2);
                c10866e.m56378V(this);
                c10866e.m56386d0(false);
                spannableStringBuilder.setSpan(c10866e, length, length2, 33);
                spannableStringBuilder.setSpan(c23670a, length, length2, 33);
                actionTitleDialog.f61630p.setMovementMethod(CustomMovementMethod.m56305e());
            }
            actionTitleDialog.f61630p.setText(spannableStringBuilder);
            return actionTitleDialog;
        }
    }

    /* renamed from: com.zing.zalo.ui.custom.ActionTitleDialog$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11842b {
        /* renamed from: I9 */
        void mo65816I9(int i11);
    }

    public ActionTitleDialog(Context context) {
        super(context);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        setGravity(16);
        RobotoTextView robotoTextView = new RobotoTextView(context);
        this.f61630p = robotoTextView;
        robotoTextView.setTextSize(0, AbstractC23136l9.m118655I(AbstractC16802y.dialog_title_text_size));
        this.f61630p.setTextColor(C23212s8.m119607o(context, AbstractC16781w.TabSelectedColor));
        this.f61630p.setTextStyleBold(true);
        this.f61630p.setGravity(16);
        this.f61630p.setEllipsize(TextUtils.TruncateAt.END);
        this.f61630p.setIncludeFontPadding(false);
        addView(this.f61630p, new LinearLayout.LayoutParams(-1, -2));
    }
}
