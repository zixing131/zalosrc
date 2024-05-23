package com.zing.zalo.zinstant.zom.text;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class ZOMParagraph {
    private long nativeHandle;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Alignment {
        public static final int center = 1;
        public static final int left = 0;
        public static final int right = 2;
    }

    public ZOMParagraph(long j11) {
        this.nativeHandle = j11;
    }

    private native Object getNextTextSpan(long j11);

    private native void resetIterator(long j11);

    private native int size(long j11);

    public ZOMTextSpan getNextTextSpan() {
        Object nextTextSpan = getNextTextSpan(this.nativeHandle);
        if (nextTextSpan != null) {
            return (ZOMTextSpan) nextTextSpan;
        }
        return null;
    }

    public void resetIterator() {
        resetIterator(this.nativeHandle);
    }

    public int size() {
        return size(this.nativeHandle);
    }
}
