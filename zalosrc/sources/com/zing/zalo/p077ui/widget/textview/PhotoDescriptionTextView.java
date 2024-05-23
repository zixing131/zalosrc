package com.zing.zalo.p077ui.widget.textview;

import android.content.Context;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.textview.PhotoDescriptionTextView;
import com.zing.zalo.social.controls.C10866e;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import p304ks.AbstractC21935u;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;

/* loaded from: classes6.dex */
public class PhotoDescriptionTextView extends RobotoTextView {

    /* renamed from: A */
    InterfaceC27218a f71415A;

    /* renamed from: B */
    protected String f71416B;

    /* renamed from: C */
    private Layout f71417C;

    /* renamed from: D */
    protected CharSequence f71418D;

    /* renamed from: E */
    public List f71419E;

    /* renamed from: F */
    CharSequence f71420F;

    /* renamed from: G */
    public List f71421G;

    /* renamed from: H */
    boolean f71422H;

    /* renamed from: I */
    int f71423I;

    /* renamed from: J */
    boolean f71424J;

    /* renamed from: K */
    protected int f71425K;

    /* renamed from: L */
    protected int f71426L;

    /* renamed from: M */
    protected String f71427M;

    /* renamed from: N */
    protected String f71428N;

    /* renamed from: O */
    protected InterfaceC13798a f71429O;

    /* renamed from: com.zing.zalo.ui.widget.textview.PhotoDescriptionTextView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13798a {
        /* renamed from: a */
        void mo77060a(boolean z11);
    }

    public PhotoDescriptionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71425K = 87;
        this.f71426L = 3;
        this.f71427M = AbstractC23136l9.m118743r0(AbstractC8020f0.str_see_less);
        this.f71428N = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m77051r(int i11) {
        m77055m(true);
        InterfaceC13798a interfaceC13798a = this.f71429O;
        if (interfaceC13798a != null) {
            interfaceC13798a.mo77060a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m77052s(int i11) {
        m77055m(false);
        InterfaceC13798a interfaceC13798a = this.f71429O;
        if (interfaceC13798a != null) {
            interfaceC13798a.mo77060a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m77053u(int i11) {
        m77055m(true);
        InterfaceC13798a interfaceC13798a = this.f71429O;
        if (interfaceC13798a != null) {
            interfaceC13798a.mo77060a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m77054w(int i11) {
        m77055m(false);
        InterfaceC13798a interfaceC13798a = this.f71429O;
        if (interfaceC13798a != null) {
            interfaceC13798a.mo77060a(false);
        }
    }

    public List<C10866e> getSpans() {
        return this.f71422H ? this.f71421G : this.f71419E;
    }

    /* renamed from: m */
    public void m77055m(boolean z11) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (this.f71422H != z11) {
            this.f71422H = z11;
            if (z11 && (charSequence2 = this.f71420F) != null) {
                setText(charSequence2);
                this.f71424J = false;
            } else if (!z11 && (charSequence = this.f71418D) != null) {
                setText(charSequence);
                this.f71424J = false;
            } else {
                setText(this.f71416B);
                this.f71424J = true;
            }
            scrollTo(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.regex.Pattern] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x00cc -> B:34:0x00cf). Please report as a decompilation issue!!! */
    /* renamed from: n */
    public CharSequence m77056n(Layout layout) {
        int i11;
        String str;
        String str2;
        StringBuilder sb2;
        CharSequence charSequence = this.f71420F;
        if (charSequence != null) {
            return charSequence;
        }
        if (!TextUtils.isEmpty(this.f71416B) && layout != null) {
            try {
                this.f71421G = new ArrayList();
                String str3 = this.f71416B;
                int lineCount = layout.getLineCount();
                int i12 = this.f71426L;
                if (lineCount > i12) {
                    i11 = Math.min(this.f71425K, layout.getLineStart(i12 - 1));
                } else {
                    i11 = this.f71425K;
                }
                if (str3.length() > i11) {
                    String format = String.format(" <a href=\"zm://SeeLess/\">%s</a> ", this.f71427M);
                    if (str3.charAt(str3.length() - 1) == '\n') {
                        sb2 = new StringBuilder();
                        sb2.append(str3);
                        sb2.append(format);
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(str3);
                        sb2.append("\n");
                        sb2.append(format);
                    }
                    str3 = sb2.toString();
                }
                ?? m119747k = AbstractC23244v8.m119747k(str3.replaceAll("(\r\n|\n)", "<br/>"));
                try {
                    Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(m119747k);
                    m119747k = m119747k;
                    if (matcher.find()) {
                        if (TextUtils.indexOf((CharSequence) m119747k, "<a href=\"http") >= 0) {
                            m119747k = m119747k;
                        } else if (matcher.group().startsWith("https://")) {
                            m119747k = matcher.replaceAll("<a href=\"$1\">$1</a>");
                        } else if (matcher.group().startsWith("http://")) {
                            m119747k = matcher.replaceAll("<a href=\"$1\">$1</a>");
                        } else {
                            m119747k = matcher.replaceAll("<a href=\"http://$1\">$1</a>");
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    m119747k = m119747k;
                }
                try {
                    Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(m119747k);
                    while (matcher2.find()) {
                        ?? group = matcher2.group(0);
                        if (group.startsWith("<a href=\"zm://Profile/")) {
                            Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                            if (!matcher3.find()) {
                                str = "";
                            } else {
                                String replace = matcher3.group(1).replace("\"", "");
                                str = replace.substring(replace.lastIndexOf("/") + 1);
                            }
                            String group2 = matcher2.group(1);
                            String m114542i = AbstractC21935u.m114542i(str, group2);
                            if (!group2.equals(m114542i)) {
                                str2 = group.replace(group2, m114542i);
                            } else {
                                str2 = group;
                            }
                            if (m119747k.contains(group) && !group.equals(str2)) {
                                m119747k = m119747k.replace(group, str2);
                            }
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(m119747k).replaceAll("&lt;"));
                SpannableString spannableString = new SpannableString(fromHtml.toString());
                for (Object obj : fromHtml.getSpans(0, fromHtml.length(), Object.class)) {
                    int spanStart = fromHtml.getSpanStart(obj);
                    int spanEnd = fromHtml.getSpanEnd(obj);
                    int spanFlags = fromHtml.getSpanFlags(obj);
                    if (obj instanceof URLSpan) {
                        C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                        c10866e.m56380X(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white_60));
                        c10866e.m56381Y(getTextSize());
                        c10866e.m56377U(getResources().getColor(AbstractC16801x.cTime1));
                        c10866e.m56365I(this.f71415A);
                        if (c10866e.m56406u() == 102) {
                            c10866e.m56378V(new C10866e.a() { // from class: qb0.d
                                @Override // com.zing.zalo.social.controls.C10866e.a
                                /* renamed from: a */
                                public final void mo44545a(int i13) {
                                    PhotoDescriptionTextView.this.m77051r(i13);
                                }
                            });
                        } else if (c10866e.m56406u() == 108) {
                            c10866e.m56378V(new C10866e.a() { // from class: qb0.e
                                @Override // com.zing.zalo.social.controls.C10866e.a
                                /* renamed from: a */
                                public final void mo44545a(int i13) {
                                    PhotoDescriptionTextView.this.m77052s(i13);
                                }
                            });
                        }
                        this.f71421G.add(c10866e);
                        spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                    }
                }
                return C28652r.m143349v().m143350A(spannableString);
            } catch (Exception unused) {
                if (this.f71416B != null) {
                    return C28652r.m143349v().m143353D(this.f71416B);
                }
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        boolean z11;
        super.onMeasure(i11, i12);
        if (this.f71416B == null) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (this.f71423I == measuredWidth && ((!this.f71422H || getText().equals(this.f71420F)) && (this.f71422H || getText().equals(this.f71418D)))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return;
        }
        if (this.f71423I != measuredWidth) {
            this.f71423I = measuredWidth;
            m77059y();
            if (!this.f71424J) {
                setText(this.f71416B);
                this.f71424J = true;
                if (this.f71422H) {
                    this.f71422H = false;
                    InterfaceC13798a interfaceC13798a = this.f71429O;
                    if (interfaceC13798a != null) {
                        interfaceC13798a.mo77060a(false);
                    }
                }
                super.onMeasure(i11, i12);
            }
        }
        if (this.f71424J) {
            this.f71417C = getLayout();
        }
        if (z11) {
            if (this.f71422H) {
                CharSequence m77056n = m77056n(this.f71417C);
                this.f71420F = m77056n;
                setText(m77056n);
            } else {
                CharSequence m77057p = m77057p(this.f71417C);
                this.f71418D = m77057p;
                setText(m77057p);
            }
            this.f71424J = false;
            super.onMeasure(i11, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.regex.Pattern] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x00d4 -> B:36:0x00d7). Please report as a decompilation issue!!! */
    /* renamed from: p */
    public CharSequence m77057p(Layout layout) {
        int i11;
        String str;
        String str2;
        String str3;
        StringBuilder sb2;
        CharSequence charSequence = this.f71418D;
        if (charSequence != null) {
            return charSequence;
        }
        if (TextUtils.isEmpty(this.f71416B) || layout == null) {
            return "";
        }
        ?? r12 = this.f71416B;
        try {
            String format = String.format("…<a href=\"zm://SeeMore/\">%s</a> ", this.f71428N);
            int lineCount = layout.getLineCount();
            int i12 = this.f71426L;
            if (lineCount > i12) {
                i11 = Math.min(this.f71425K, layout.getLineStart(i12 - 1));
            } else {
                i11 = this.f71425K;
            }
            if (r12.length() > i11) {
                String substring = r12.substring(0, i11);
                if (substring.charAt(substring.length() - 1) == '\n') {
                    sb2 = new StringBuilder();
                    sb2.append(substring);
                    sb2.append(format);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(substring);
                    sb2.append("\n");
                    sb2.append(format);
                }
                str = sb2.toString();
            } else {
                str = this.f71416B;
            }
            r12 = AbstractC23244v8.m119747k(str.replaceAll("(\r\n|\n)", "<br/>"));
            this.f71419E = new ArrayList();
            try {
                Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(r12);
                r12 = r12;
                if (matcher.find()) {
                    if (r12.contains("<a href=\"http")) {
                        r12 = r12;
                    } else if (matcher.group().startsWith("https://")) {
                        r12 = matcher.replaceAll("<a href=\"$1\">$1</a>");
                    } else if (matcher.group().startsWith("http://")) {
                        r12 = matcher.replaceAll("<a href=\"$1\">$1</a>");
                    } else {
                        r12 = matcher.replaceAll("<a href=\"http://$1\">$1</a>");
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                r12 = r12;
            }
            try {
                Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(r12);
                while (matcher2.find()) {
                    ?? group = matcher2.group(0);
                    if (group.startsWith("<a href=\"zm://Profile/")) {
                        Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                        if (!matcher3.find()) {
                            str2 = "";
                        } else {
                            String replace = matcher3.group(1).replace("\"", "");
                            str2 = replace.substring(replace.lastIndexOf("/") + 1);
                        }
                        String group2 = matcher2.group(1);
                        String m114542i = AbstractC21935u.m114542i(str2, group2);
                        if (!group2.equals(m114542i)) {
                            str3 = group.replace(group2, m114542i);
                        } else {
                            str3 = group;
                        }
                        if (r12.contains(group) && !group.equals(str3)) {
                            r12 = r12.replace(group, str3);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(r12).replaceAll("&lt;"));
            SpannableString spannableString = new SpannableString(fromHtml.toString());
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            if (spans.length > 0) {
                for (Object obj : spans) {
                    int spanStart = fromHtml.getSpanStart(obj);
                    int spanEnd = fromHtml.getSpanEnd(obj);
                    int spanFlags = fromHtml.getSpanFlags(obj);
                    if (obj instanceof URLSpan) {
                        C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                        c10866e.m56382Z(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white_60));
                        c10866e.m56383a0(getTextSize());
                        this.f71419E.add(c10866e);
                        if (c10866e.m56406u() == 102) {
                            c10866e.m56378V(new C10866e.a() { // from class: qb0.b
                                @Override // com.zing.zalo.social.controls.C10866e.a
                                /* renamed from: a */
                                public final void mo44545a(int i13) {
                                    PhotoDescriptionTextView.this.m77053u(i13);
                                }
                            });
                        } else if (c10866e.m56406u() == 108) {
                            c10866e.m56378V(new C10866e.a() { // from class: qb0.c
                                @Override // com.zing.zalo.social.controls.C10866e.a
                                /* renamed from: a */
                                public final void mo44545a(int i13) {
                                    PhotoDescriptionTextView.this.m77054w(i13);
                                }
                            });
                        }
                        spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                    }
                }
                return C28652r.m143349v().m143354E(spannableString);
            }
            return C28652r.m143349v().m143354E(new SpannableString(r12.replaceAll("<br/>", "\n")));
        } catch (Exception e13) {
            e13.printStackTrace();
            return r12;
        }
    }

    /* renamed from: q */
    public boolean m77058q() {
        return this.f71422H;
    }

    public void setActivity(InterfaceC27218a interfaceC27218a) {
        this.f71415A = interfaceC27218a;
    }

    public void setMaxCharCollapsed(int i11) {
        this.f71425K = i11;
    }

    public void setMaxLineCollapsed(int i11) {
        this.f71426L = i11;
    }

    public void setOnCollapseExpandListener(InterfaceC13798a interfaceC13798a) {
        this.f71429O = interfaceC13798a;
    }

    public void setOriginalText(String str) {
        this.f71416B = str;
        m77059y();
        setText(this.f71416B);
        this.f71424J = true;
        scrollTo(0, 0);
        this.f71422H = false;
    }

    /* renamed from: y */
    void m77059y() {
        this.f71418D = null;
        this.f71420F = null;
        this.f71421G = null;
        this.f71419E = null;
        this.f71417C = null;
    }

    public PhotoDescriptionTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f71425K = 87;
        this.f71426L = 3;
        this.f71427M = AbstractC23136l9.m118743r0(AbstractC8020f0.str_see_less);
        this.f71428N = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more);
    }
}
