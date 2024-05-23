package p458qr;

import am.AbstractC0906d0;
import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uicontrol.Snackbar;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import java.util.Locale;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p458qr.C25485r;
import p716zh.C31901e8;

/* renamed from: qr.r */
/* loaded from: classes4.dex */
public final class C25485r {

    /* renamed from: a */
    public static final C25485r f122083a = new C25485r();

    /* renamed from: qr.r$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo87261a(boolean z11);
    }

    private C25485r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m132021d(CheckBox checkBox, View view) {
        AbstractC19074t.m100208f(checkBox, "$cbDeleteContact");
        checkBox.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m132022e(a aVar, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(aVar, "$listener");
        aVar.mo87261a(z11);
    }

    /* renamed from: c */
    public final View m132023c(Context context, ContactProfile contactProfile, final a aVar) {
        int m127173b0;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(contactProfile, "contactProfile");
        AbstractC19074t.m100208f(aVar, "listener");
        try {
            View inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.checkbox_remove_contact_view, (ViewGroup) null);
            View findViewById = inflate.findViewById(AbstractC6918a0.cbRemoveContact);
            AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.CheckBox");
            final CheckBox checkBox = (CheckBox) findViewById;
            C31901e8 m2800f = AbstractC0906d0.m2800f(context, contactProfile.f42455y);
            if (m2800f != null && !TextUtils.isEmpty(m2800f.m153297j())) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format("%s (%s)", Arrays.copyOf(new Object[]{m2800f.m153299q(), m2800f.m153297j()}, 2));
                AbstractC19074t.m100207e(format, "format(...)");
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete_phone_number_in_contact);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String format2 = String.format(m118743r0, Arrays.copyOf(new Object[]{format}, 1));
                AbstractC19074t.m100207e(format2, "format(...)");
                m127173b0 = AbstractC24342w.m127173b0(format2, format, 0, false, 6, null);
                SpannableString spannableString = new SpannableString(format2);
                spannableString.setSpan(new StyleSpan(1), m127173b0, format.length() + m127173b0, 33);
                View findViewById2 = inflate.findViewById(AbstractC6918a0.tvRemoveContact);
                AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) findViewById2).setText(spannableString);
                inflate.setOnClickListener(new View.OnClickListener() { // from class: qr.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C25485r.m132021d(checkBox, view);
                    }
                });
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qr.q
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        C25485r.m132022e(C25485r.a.this, compoundButton, z11);
                    }
                });
                return inflate;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:            if (r7 == null) goto L11;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m132024f(Snackbar snackbar, int i11) {
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i12;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i13;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int i14;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        int i15;
        String str2;
        StaticLayout staticLayout;
        boolean m127128x;
        StaticLayout.Builder obtain;
        String obj;
        AbstractC19074t.m100208f(snackbar, "snackBar");
        View m88025i = snackbar.m88025i();
        AbstractC19074t.m100206d(m88025i, "null cannot be cast to non-null type com.zing.zalo.uicontrol.Snackbar.SnackbarLayout");
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) m88025i;
        View findViewById = snackbarLayout.findViewById(AbstractC6918a0.snackbar_text);
        AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = snackbarLayout.findViewById(AbstractC6918a0.snackbar_action);
        AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.Button");
        Button button = (Button) findViewById2;
        View findViewById3 = snackbarLayout.findViewById(AbstractC6918a0.snackbar_icon);
        AbstractC19074t.m100206d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById3;
        Context context = snackbarLayout.getContext();
        if (context == null) {
            context = MainApplication.Companion.m35500c();
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(button.getTextSize());
        CharSequence text = button.getText();
        if (text != null && (obj = text.toString()) != null) {
            str = obj.toUpperCase(Locale.ROOT);
            AbstractC19074t.m100207e(str, "toUpperCase(...)");
        }
        str = "";
        float measureText = textPaint.measureText(str);
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i12 = marginLayoutParams.leftMargin;
        } else {
            i12 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = button.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams2 = null;
        }
        if (marginLayoutParams2 != null) {
            i13 = marginLayoutParams2.rightMargin;
        } else {
            i13 = 0;
        }
        int i16 = i12 + i13;
        int paddingLeft = button.getPaddingLeft() + button.getPaddingRight();
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(textView.getTextSize());
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        } else {
            marginLayoutParams3 = null;
        }
        if (marginLayoutParams3 != null) {
            i14 = marginLayoutParams3.leftMargin;
        } else {
            i14 = 0;
        }
        ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        } else {
            marginLayoutParams4 = null;
        }
        if (marginLayoutParams4 != null) {
            i15 = marginLayoutParams4.rightMargin;
        } else {
            i15 = 0;
        }
        int i17 = i14 + i15;
        int paddingLeft2 = textView.getPaddingLeft() + textView.getPaddingRight();
        CharSequence text2 = textView.getText();
        if (text2 == null || (str2 = text2.toString()) == null) {
            str2 = "";
        }
        float f11 = (i11 - ((measureText + i16) + paddingLeft)) - (i17 + paddingLeft2);
        if (Build.VERSION.SDK_INT >= 23) {
            obtain = StaticLayout.Builder.obtain(str2, 0, str2.length(), textPaint2, (int) f11);
            AbstractC19074t.m100207e(obtain, "obtain(...)");
            staticLayout = obtain.build();
            AbstractC19074t.m100205c(staticLayout);
        } else {
            staticLayout = new StaticLayout(str2, textPaint2, (int) f11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
        int lineCount = staticLayout.getLineCount();
        ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams6 = button.getLayoutParams();
        if ((layoutParams5 instanceof LinearLayout.LayoutParams) && (layoutParams6 instanceof LinearLayout.LayoutParams) && lineCount != 1) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                snackbarLayout.removeAllViews();
                snackbarLayout.setOrientation(1);
                ((LinearLayout.LayoutParams) layoutParams5).topMargin = AbstractC23136l9.m118742r(4.0f);
                snackbarLayout.m88041c(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f));
                button.setMinHeight(AbstractC23136l9.m118742r(0.0f));
                button.setMinimumHeight(0);
                button.setPadding(AbstractC23136l9.m118736p(AbstractC16802y.design_snackbar_padding_horizontal), 0, AbstractC23136l9.m118736p(AbstractC16802y.design_snackbar_padding_horizontal), 0);
                ((LinearLayout.LayoutParams) layoutParams6).bottomMargin = AbstractC23136l9.m118742r(16.0f);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(3);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.addView(imageView);
                linearLayout.addView(textView);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout2.setOrientation(1);
                linearLayout2.addView(linearLayout);
                linearLayout2.addView(button);
                snackbarLayout.addView(linearLayout2);
            }
        }
    }
}
