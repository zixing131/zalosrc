package androidx.core.os;

import androidx.core.util.AbstractC1482d;

/* loaded from: classes2.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(AbstractC1482d.m7479e(str, "The operation has been canceled."));
    }
}
