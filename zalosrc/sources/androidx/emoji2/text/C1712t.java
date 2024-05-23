package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.AbstractC1475n;
import java.util.stream.IntStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.emoji2.text.t */
/* loaded from: classes2.dex */
public class C1712t implements Spannable {

    /* renamed from: p */
    private boolean f6899p = false;

    /* renamed from: q */
    private Spannable f6900q;

    /* renamed from: androidx.emoji2.text.t$a */
    /* loaded from: classes2.dex */
    private static class a {
        /* renamed from: a */
        static IntStream m8775a(CharSequence charSequence) {
            IntStream chars;
            chars = charSequence.chars();
            return chars;
        }

        /* renamed from: b */
        static IntStream m8776b(CharSequence charSequence) {
            IntStream codePoints;
            codePoints = charSequence.codePoints();
            return codePoints;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.t$b */
    /* loaded from: classes2.dex */
    public static class b {
        b() {
        }

        /* renamed from: a */
        boolean mo8777a(CharSequence charSequence) {
            return charSequence instanceof AbstractC1475n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.t$c */
    /* loaded from: classes2.dex */
    public static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.C1712t.b
        /* renamed from: a */
        boolean mo8777a(CharSequence charSequence) {
            if (!AbstractC1713u.m8778a(charSequence) && !(charSequence instanceof AbstractC1475n)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1712t(Spannable spannable) {
        this.f6900q = spannable;
    }

    /* renamed from: a */
    private void m8772a() {
        Spannable spannable = this.f6900q;
        if (!this.f6899p && m8773c().mo8777a(spannable)) {
            this.f6900q = new SpannableString(spannable);
        }
        this.f6899p = true;
    }

    /* renamed from: c */
    static b m8773c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new b();
        }
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Spannable m8774b() {
        return this.f6900q;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i11) {
        return this.f6900q.charAt(i11);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.m8775a(this.f6900q);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.m8776b(this.f6900q);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f6900q.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f6900q.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f6900q.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i11, int i12, Class cls) {
        return this.f6900q.getSpans(i11, i12, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f6900q.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i11, int i12, Class cls) {
        return this.f6900q.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m8772a();
        this.f6900q.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i11, int i12, int i13) {
        m8772a();
        this.f6900q.setSpan(obj, i11, i12, i13);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i11, int i12) {
        return this.f6900q.subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f6900q.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1712t(CharSequence charSequence) {
        this.f6900q = new SpannableString(charSequence);
    }
}
