package org.webrtc;

import android.util.Pair;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public class RealtimeStats {
    private float _averageVal;
    private int _maxVal;
    private int _minVal;
    private int _numVal;
    private long _scopeMs;
    private int _totalVal;
    final Object _stateLock = new Object();
    private LinkedList<ValueWithTime> _listValue = new LinkedList<>();
    private final String LOG_TAG = "RealtimeStats";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public class ValueWithTime extends Pair<Integer, Long> {
        public ValueWithTime(int i11, long j11) {
            super(Integer.valueOf(i11), Long.valueOf(j11));
        }
    }

    public RealtimeStats(int i11) {
        this._scopeMs = 1000L;
        this._scopeMs = i11;
    }

    private void resetResult() {
        this._minVal = Integer.MAX_VALUE;
        this._maxVal = Integer.MIN_VALUE;
        this._averageVal = 0.0f;
        this._totalVal = 0;
        this._numVal = 0;
    }

    private void updateList() {
        synchronized (this._stateLock) {
            try {
                try {
                    resetResult();
                    long nanoTime = System.nanoTime();
                    while (this._listValue.size() > 0 && (this._listValue.getFirst() == null || nanoTime - ((Long) ((Pair) this._listValue.getFirst()).second).longValue() > this._scopeMs * 1000000)) {
                        this._listValue.removeFirst();
                    }
                    Iterator<ValueWithTime> it = this._listValue.iterator();
                    int i11 = 0;
                    int i12 = Integer.MAX_VALUE;
                    int i13 = Integer.MIN_VALUE;
                    while (it.hasNext()) {
                        ValueWithTime next = it.next();
                        i11 += ((Integer) ((Pair) next).first).intValue();
                        if (((Integer) ((Pair) next).first).intValue() < i12) {
                            i12 = ((Integer) ((Pair) next).first).intValue();
                        }
                        if (((Integer) ((Pair) next).first).intValue() > i13) {
                            i13 = ((Integer) ((Pair) next).first).intValue();
                        }
                    }
                    int size = this._listValue.size();
                    this._numVal = size;
                    this._totalVal = i11;
                    if (size > 0) {
                        this._averageVal = i11 / size;
                        this._minVal = i12;
                        this._maxVal = i13;
                    } else {
                        resetResult();
                    }
                } catch (Exception e11) {
                    Logging.m127854e("RealtimeStats", "updateList exception: " + e11.getMessage());
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addValue(int i11) {
        ValueWithTime valueWithTime = new ValueWithTime(i11, System.nanoTime());
        synchronized (this._stateLock) {
            this._listValue.add(valueWithTime);
        }
    }

    public float getAverage() {
        updateList();
        return this._averageVal;
    }

    public float getMax() {
        updateList();
        return this._maxVal;
    }

    public float getMin() {
        updateList();
        return this._minVal;
    }

    public int getNum() {
        updateList();
        return this._numVal;
    }

    public float getTotal() {
        updateList();
        return this._totalVal;
    }

    public void reset() {
        this._listValue.clear();
        resetResult();
    }

    public void setScope(int i11) {
        this._scopeMs = i11;
    }
}
