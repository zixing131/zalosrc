package androidx.core.text;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.AbstractC1482d;

/* renamed from: androidx.core.text.n */
/* loaded from: classes2.dex */
public abstract class AbstractC1475n implements Spannable {

    /* renamed from: androidx.core.text.n$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final TextPaint f6350a;

        /* renamed from: b */
        private final TextDirectionHeuristic f6351b;

        /* renamed from: c */
        private final int f6352c;

        /* renamed from: d */
        private final int f6353d;

        /* renamed from: e */
        final PrecomputedText.Params f6354e;

        /* renamed from: androidx.core.text.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C32627a {

            /* renamed from: a */
            private final TextPaint f6355a;

            /* renamed from: b */
            private TextDirectionHeuristic f6356b;

            /* renamed from: c */
            private int f6357c;

            /* renamed from: d */
            private int f6358d;

            public C32627a(TextPaint textPaint) {
                this.f6355a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f6357c = 1;
                    this.f6358d = 1;
                } else {
                    this.f6358d = 0;
                    this.f6357c = 0;
                }
                this.f6356b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            /* renamed from: a */
            public a m7461a() {
                return new a(this.f6355a, this.f6356b, this.f6357c, this.f6358d);
            }

            /* renamed from: b */
            public C32627a m7462b(int i11) {
                this.f6357c = i11;
                return this;
            }

            /* renamed from: c */
            public C32627a m7463c(int i11) {
                this.f6358d = i11;
                return this;
            }

            /* renamed from: d */
            public C32627a m7464d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f6356b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i11, int i12) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = AbstractC1465d.m7446a(textPaint).setBreakStrategy(i11);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i12);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f6354e = build;
            } else {
                this.f6354e = null;
            }
            this.f6350a = textPaint;
            this.f6351b = textDirectionHeuristic;
            this.f6352c = i11;
            this.f6353d = i12;
        }

        /* renamed from: a */
        public boolean m7456a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i11 = Build.VERSION.SDK_INT;
            if ((i11 >= 23 && (this.f6352c != aVar.m7457b() || this.f6353d != aVar.m7458c())) || this.f6350a.getTextSize() != aVar.m7460e().getTextSize() || this.f6350a.getTextScaleX() != aVar.m7460e().getTextScaleX() || this.f6350a.getTextSkewX() != aVar.m7460e().getTextSkewX() || this.f6350a.getLetterSpacing() != aVar.m7460e().getLetterSpacing() || !TextUtils.equals(this.f6350a.getFontFeatureSettings(), aVar.m7460e().getFontFeatureSettings()) || this.f6350a.getFlags() != aVar.m7460e().getFlags()) {
                return false;
            }
            if (i11 >= 24) {
                textLocales = this.f6350a.getTextLocales();
                textLocales2 = aVar.m7460e().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.f6350a.getTextLocale().equals(aVar.m7460e().getTextLocale())) {
                return false;
            }
            if (this.f6350a.getTypeface() == null) {
                if (aVar.m7460e().getTypeface() != null) {
                    return false;
                }
                return true;
            }
            if (!this.f6350a.getTypeface().equals(aVar.m7460e().getTypeface())) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public int m7457b() {
            return this.f6352c;
        }

        /* renamed from: c */
        public int m7458c() {
            return this.f6353d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m7459d() {
            return this.f6351b;
        }

        /* renamed from: e */
        public TextPaint m7460e() {
            return this.f6350a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (m7456a(aVar) && this.f6351b == aVar.m7459d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT >= 24) {
                textLocales = this.f6350a.getTextLocales();
                return AbstractC1482d.m7476b(Float.valueOf(this.f6350a.getTextSize()), Float.valueOf(this.f6350a.getTextScaleX()), Float.valueOf(this.f6350a.getTextSkewX()), Float.valueOf(this.f6350a.getLetterSpacing()), Integer.valueOf(this.f6350a.getFlags()), textLocales, this.f6350a.getTypeface(), Boolean.valueOf(this.f6350a.isElegantTextHeight()), this.f6351b, Integer.valueOf(this.f6352c), Integer.valueOf(this.f6353d));
            }
            return AbstractC1482d.m7476b(Float.valueOf(this.f6350a.getTextSize()), Float.valueOf(this.f6350a.getTextScaleX()), Float.valueOf(this.f6350a.getTextSkewX()), Float.valueOf(this.f6350a.getLetterSpacing()), Integer.valueOf(this.f6350a.getFlags()), this.f6350a.getTextLocale(), this.f6350a.getTypeface(), Boolean.valueOf(this.f6350a.isElegantTextHeight()), this.f6351b, Integer.valueOf(this.f6352c), Integer.valueOf(this.f6353d));
        }

        public String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f6350a.getTextSize());
            sb2.append(", textScaleX=" + this.f6350a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f6350a.getTextSkewX());
            int i11 = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f6350a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f6350a.isElegantTextHeight());
            if (i11 >= 24) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", textLocale=");
                textLocales = this.f6350a.getTextLocales();
                sb3.append(textLocales);
                sb2.append(sb3.toString());
            } else {
                sb2.append(", textLocale=" + this.f6350a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f6350a.getTypeface());
            if (i11 >= 26) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(", variationSettings=");
                fontVariationSettings = this.f6350a.getFontVariationSettings();
                sb4.append(fontVariationSettings);
                sb2.append(sb4.toString());
            }
            sb2.append(", textDir=" + this.f6351b);
            sb2.append(", breakStrategy=" + this.f6352c);
            sb2.append(", hyphenationFrequency=" + this.f6353d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f6350a = textPaint;
            textDirection = params.getTextDirection();
            this.f6351b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f6352c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f6353d = hyphenationFrequency;
            this.f6354e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
