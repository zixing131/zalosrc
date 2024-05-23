package mz;

import android.text.Editable;
import android.text.Html;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import nb0.C23673d;
import on0.AbstractC24341v;
import org.xml.sax.XMLReader;

/* renamed from: mz.a */
/* loaded from: classes4.dex */
public final class C23491a implements Html.TagHandler {

    /* renamed from: a */
    private a f114051a;

    /* renamed from: mz.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final int f114052a;

        /* renamed from: b */
        private final int f114053b;

        /* renamed from: c */
        private final int f114054c;

        public a(int i11, int i12, int i13) {
            this.f114052a = i11;
            this.f114053b = i12;
            this.f114054c = i13;
        }

        /* renamed from: a */
        public final int m123304a() {
            return this.f114054c;
        }

        /* renamed from: b */
        public final int m123305b() {
            return this.f114052a;
        }

        /* renamed from: c */
        public final int m123306c() {
            return this.f114053b;
        }
    }

    /* renamed from: a */
    private final void m123301a(Editable editable, int i11) {
        int length = editable.length();
        if (length == 0) {
            return;
        }
        int i12 = 0;
        for (int i13 = length - 1; i13 >= 0 && editable.charAt(i13) == '\n'; i13--) {
            i12++;
        }
        while (i12 < i11) {
            editable.append("\n");
            i12++;
        }
    }

    /* renamed from: b */
    private final Object m123302b(Editable editable, Class cls) {
        Object[] spans = editable.getSpans(0, editable.length(), cls);
        AbstractC19074t.m100205c(spans);
        if (spans.length != 0) {
            for (int length = spans.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(spans[i11]) == 17) {
                    return spans[i11];
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: c */
    public final void m123303c(a aVar) {
        this.f114051a = aVar;
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z11, String str, Editable editable, XMLReader xMLReader) {
        boolean m127126v;
        boolean m127126v2;
        int m118742r;
        int m118742r2;
        int m118742r3;
        if (editable != null && str != null) {
            try {
                m127126v = AbstractC24341v.m127126v(str, "ul", true);
                if (!m127126v) {
                    m127126v2 = AbstractC24341v.m127126v(str, "li", true);
                    if (m127126v2) {
                        if (z11) {
                            m123301a(editable, 1);
                            a aVar = this.f114051a;
                            if (aVar != null) {
                                m118742r = aVar.m123305b();
                            } else {
                                m118742r = AbstractC23136l9.m118742r(10.0f);
                            }
                            a aVar2 = this.f114051a;
                            if (aVar2 != null) {
                                m118742r2 = aVar2.m123306c();
                            } else {
                                m118742r2 = AbstractC23136l9.m118742r(10.0f);
                            }
                            a aVar3 = this.f114051a;
                            if (aVar3 != null) {
                                m118742r3 = aVar3.m123304a();
                            } else {
                                m118742r3 = AbstractC23136l9.m118742r(1.5f);
                            }
                            editable.setSpan(new C23673d(m118742r, m118742r2, m118742r3), editable.length(), editable.length(), 17);
                            return;
                        }
                        C23673d c23673d = (C23673d) m123302b(editable, C23673d.class);
                        if (c23673d != null) {
                            editable.append("\n");
                            int spanStart = editable.getSpanStart(c23673d);
                            editable.removeSpan(c23673d);
                            if (spanStart != editable.length()) {
                                editable.setSpan(c23673d, spanStart, editable.length(), 33);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                m123301a(editable, 1);
            } catch (Exception e11) {
                AbstractC23350e.m122774d("HtmlCustomTagHandler", e11.toString());
            }
        }
    }
}
