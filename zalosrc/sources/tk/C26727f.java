package tk;

import android.text.SpannableStringBuilder;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* renamed from: tk.f */
/* loaded from: classes3.dex */
public final class C26727f {

    /* renamed from: a */
    private final int f126756a;

    /* renamed from: b */
    private final SpannableStringBuilder f126757b;

    public C26727f(int i11, SpannableStringBuilder spannableStringBuilder) {
        AbstractC19074t.m100208f(spannableStringBuilder, "text");
        this.f126756a = i11;
        this.f126757b = spannableStringBuilder;
    }

    /* renamed from: a */
    public final SpannableStringBuilder m137463a() {
        return this.f126757b;
    }

    /* renamed from: b */
    public final int m137464b() {
        return this.f126756a;
    }

    public /* synthetic */ C26727f(int i11, SpannableStringBuilder spannableStringBuilder, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? new SpannableStringBuilder(AbstractC23136l9.m118743r0(i11)) : spannableStringBuilder);
    }
}
