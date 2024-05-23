package vj0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;

/* renamed from: vj0.c */
/* loaded from: classes7.dex */
public final class C28269c {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private int f131834b;

    /* renamed from: c */
    private int f131835c;

    /* renamed from: d */
    private int f131836d;

    /* renamed from: e */
    private int f131837e;

    /* renamed from: g */
    private float f131839g;

    /* renamed from: j */
    private boolean f131842j;

    /* renamed from: a */
    private CharSequence f131833a = "";

    /* renamed from: f */
    private float f131838f = 1.0f;

    /* renamed from: h */
    private boolean f131840h = true;

    /* renamed from: i */
    private TextUtils.TruncateAt f131841i = TextUtils.TruncateAt.END;

    /* renamed from: k */
    private int f131843k = Integer.MAX_VALUE;

    /* renamed from: l */
    private Layout.Alignment f131844l = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: m */
    private TextPaint f131845m = new TextPaint(1);

    /* renamed from: vj0.c$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final CharSequence m142422a(CharSequence charSequence) {
            if (charSequence instanceof Appendable) {
                ((Appendable) charSequence).append((char) 8230);
                return charSequence;
            }
            throw new IllegalArgumentException("Type of \"(" + ((Object) charSequence) + "\" must be Appendable");
        }

        /* renamed from: b */
        private final Layout m142423b(C28267a c28267a) {
            int m116580c;
            BoringLayout make = BoringLayout.make(c28267a.m142400j(), c28267a.m142399i(), c28267a.m142398h(), c28267a.m142391a(), c28267a.m142402l(), c28267a.m142401k(), c28267a.m142403m(), c28267a.m142395e(), c28267a.m142394d(), c28267a.m142393c());
            m116580c = AbstractC22543l.m116580c(make.getLineCount() - 1, 0);
            try {
                if (m116580c == c28267a.m142396f() - 1 && c28267a.m142394d() == TextUtils.TruncateAt.END && make.getWidth() < make.getLineWidth(m116580c)) {
                    AbstractC19074t.m100207e(make, "layout");
                    make = BoringLayout.make(m142424f(make, c28267a.m142400j()), c28267a.m142399i(), c28267a.m142398h(), c28267a.m142391a(), c28267a.m142402l(), c28267a.m142401k(), c28267a.m142403m(), c28267a.m142395e(), c28267a.m142394d(), c28267a.m142393c());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            AbstractC19074t.m100207e(make, "layout");
            return make;
        }

        /* renamed from: f */
        private final CharSequence m142424f(Layout layout, CharSequence charSequence) {
            int lineCount = layout.getLineCount() - 1;
            CharSequence subSequence = charSequence.subSequence(0, layout.getOffsetForHorizontal(lineCount, (layout.getWidth() - (layout.getLineBottom(0) - layout.getLineTop(0))) + layout.getLineLeft(lineCount)));
            m142422a(subSequence);
            return subSequence;
        }

        /* renamed from: c */
        public final Layout m142425c(C28267a c28267a) {
            StaticLayout.Builder obtain;
            StaticLayout.Builder lineSpacing;
            StaticLayout.Builder alignment;
            StaticLayout.Builder includePad;
            StaticLayout.Builder ellipsize;
            StaticLayout.Builder ellipsizedWidth;
            StaticLayout.Builder maxLines;
            StaticLayout.Builder breakStrategy;
            StaticLayout build;
            AbstractC19074t.m100208f(c28267a, "layoutParam");
            if (Build.VERSION.SDK_INT >= 24) {
                obtain = StaticLayout.Builder.obtain(c28267a.m142400j(), 0, c28267a.m142400j().length(), c28267a.m142399i(), c28267a.m142398h());
                lineSpacing = obtain.setLineSpacing(c28267a.m142401k(), c28267a.m142402l());
                alignment = lineSpacing.setAlignment(c28267a.m142391a());
                includePad = alignment.setIncludePad(c28267a.m142395e());
                ellipsize = includePad.setEllipsize(c28267a.m142394d());
                ellipsizedWidth = ellipsize.setEllipsizedWidth(c28267a.m142393c());
                maxLines = ellipsizedWidth.setMaxLines(c28267a.m142396f());
                breakStrategy = maxLines.setBreakStrategy(c28267a.m142392b());
                build = breakStrategy.build();
                AbstractC19074t.m100207e(build, "obtain(\n                …                 .build()");
                return build;
            }
            return new StaticLayout(c28267a.m142400j(), 0, c28267a.m142400j().length(), c28267a.m142399i(), c28267a.m142398h(), c28267a.m142391a(), c28267a.m142402l(), c28267a.m142401k(), c28267a.m142395e(), c28267a.m142394d(), c28267a.m142393c());
        }

        /* renamed from: d */
        public final Layout m142426d(C28267a c28267a) {
            int m116580c;
            boolean z11;
            int i11;
            AbstractC19074t.m100208f(c28267a, "layoutParam");
            if (c28267a.m142403m() != null) {
                BoringLayout.Metrics m142403m = c28267a.m142403m();
                AbstractC19074t.m100205c(m142403m);
                if (m142403m.width <= c28267a.m142398h() || c28267a.m142396f() == 1) {
                    return m142423b(c28267a);
                }
            }
            Layout m142425c = m142425c(c28267a);
            try {
                m116580c = AbstractC22543l.m116580c(m142425c.getLineCount() - 1, 0);
                if (m116580c == c28267a.m142396f() - 1 && c28267a.m142394d() == TextUtils.TruncateAt.END && m142425c.getWidth() < m142425c.getLineWidth(m116580c)) {
                    c28267a.m142405o(m142424f(m142425c, c28267a.m142400j()));
                    m142425c = m142425c(c28267a);
                }
                if (m142425c.getLineCount() > c28267a.m142396f()) {
                    if (c28267a.m142394d() == TextUtils.TruncateAt.END) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i11 = m142425c.getLineBottom(0) - m142425c.getLineTop(0);
                    } else {
                        i11 = 0;
                    }
                    int m142396f = c28267a.m142396f() - 1;
                    CharSequence subSequence = c28267a.m142400j().subSequence(0, m142425c.getOffsetForHorizontal(m142396f, (m142425c.getWidth() - i11) + m142425c.getLineLeft(m142396f)));
                    if (z11) {
                        subSequence = m142422a(subSequence);
                    }
                    c28267a.m142405o(subSequence);
                    return m142425c(c28267a);
                }
                return m142425c;
            } catch (Exception e11) {
                e11.printStackTrace();
                return m142425c;
            }
        }

        /* renamed from: e */
        public final CharSequence m142427e(CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "source");
            CharSequence transformation = SingleLineTransformationMethod.getInstance().getTransformation(charSequence, null);
            AbstractC19074t.m100207e(transformation, "getInstance().getTransformation(source, null)");
            return transformation;
        }
    }

    public C28269c() {
        m142418k(C28273g.f131856d);
    }

    /* renamed from: b */
    private final BoringLayout.Metrics m142408b() {
        try {
            return BoringLayout.isBoring(this.f131833a, this.f131845m);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private final CharSequence m142409c(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        if (this.f131842j) {
            return Companion.m142427e(charSequence);
        }
        return charSequence;
    }

    /* renamed from: a */
    public final Layout m142410a() {
        int i11;
        int i12;
        int i13;
        int m116580c;
        int m116580c2;
        CharSequence charSequence = this.f131833a;
        if (this.f131842j) {
            i11 = 1;
        } else {
            i11 = this.f131843k;
        }
        BoringLayout.Metrics m142408b = m142408b();
        if (this.f131835c == 1) {
            i12 = this.f131834b;
        } else {
            if (m142408b != null) {
                i12 = m142408b.width;
            } else {
                i12 = -1;
            }
            if (i12 < 0) {
                try {
                    i12 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, this.f131845m));
                } catch (Exception unused) {
                    i12 = (int) this.f131845m.measureText(charSequence.toString());
                }
            }
            if (this.f131835c == 2) {
                i12 = AbstractC22543l.m116584g(i12, this.f131834b);
            }
        }
        int i14 = this.f131837e;
        if (i14 != 1 && i14 != 2) {
            i13 = 0;
        } else {
            i13 = this.f131836d;
        }
        m116580c = AbstractC22543l.m116580c(i12, 0);
        m116580c2 = AbstractC22543l.m116580c(i13, 0);
        C28267a c28267a = new C28267a(charSequence, this.f131845m, m116580c, m116580c2, this.f131844l, this.f131838f, this.f131839g, this.f131840h, this.f131841i, m116580c, i11, 0, m142408b);
        Layout m142426d = Companion.m142426d(c28267a);
        if (m142426d == null) {
            return null;
        }
        if (m142426d.getLineCount() > 1 && m142426d.getHeight() > m116580c2) {
            if (this.f131837e != 0) {
                int lineCount = m142426d.getLineCount();
                while (lineCount > 0 && m142426d.getLineBottom(lineCount - 1) > m116580c2) {
                    lineCount--;
                }
                for (int i15 = lineCount + 1; i15 > 0; i15--) {
                    a aVar = Companion;
                    c28267a.m142404n(i15);
                    m142426d = aVar.m142426d(c28267a);
                    if (m142426d == null) {
                        return null;
                    }
                    if (m142426d.getHeight() <= c28267a.m142397g()) {
                        break;
                    }
                }
            }
        }
        return m142426d;
    }

    /* renamed from: d */
    public final C28269c m142411d(Layout.Alignment alignment) {
        AbstractC19074t.m100208f(alignment, "alignment");
        if (this.f131844l != alignment) {
            this.f131844l = alignment;
        }
        return this;
    }

    /* renamed from: e */
    public final C28269c m142412e(TextUtils.TruncateAt truncateAt) {
        AbstractC19074t.m100208f(truncateAt, "ellipsize");
        if (this.f131841i != truncateAt) {
            this.f131841i = truncateAt;
        }
        return this;
    }

    /* renamed from: f */
    public final C28269c m142413f(int i11, int i12) {
        if (this.f131836d != i11 || this.f131837e != i12) {
            this.f131836d = i11;
            this.f131837e = i12;
        }
        return this;
    }

    /* renamed from: g */
    public final C28269c m142414g(float f11) {
        if (this.f131845m.getLetterSpacing() != f11) {
            this.f131845m.setLetterSpacing(f11);
        }
        return this;
    }

    /* renamed from: h */
    public final C28269c m142415h(int i11) {
        if (this.f131843k != i11) {
            this.f131843k = i11;
        }
        return this;
    }

    /* renamed from: i */
    public final C28269c m142416i(CharSequence charSequence) {
        this.f131833a = m142409c(charSequence);
        return this;
    }

    /* renamed from: j */
    public final C28269c m142417j(int i11) {
        if (this.f131845m.getColor() != i11) {
            this.f131845m.setColor(i11);
        }
        return this;
    }

    /* renamed from: k */
    public final C28269c m142418k(float f11) {
        if (this.f131845m.getTextSize() != f11) {
            this.f131845m.setTextSize(f11);
        }
        return this;
    }

    /* renamed from: l */
    public final C28269c m142419l(float f11) {
        if (this.f131839g != f11) {
            this.f131839g = f11;
        }
        return this;
    }

    /* renamed from: m */
    public final C28269c m142420m(float f11) {
        if (this.f131838f != f11) {
            this.f131838f = f11;
        }
        return this;
    }

    /* renamed from: n */
    public final C28269c m142421n(int i11, int i12) {
        if (this.f131834b != i11 || this.f131835c != i12) {
            this.f131834b = i11;
            this.f131835c = i12;
        }
        return this;
    }
}
