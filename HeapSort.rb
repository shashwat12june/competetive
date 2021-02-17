class HeapSort
    def sort
        arr = gets.chomp.split(',').map(&:to_i)
        print arr
        build_heap(arr)
        print arr
        n = arr.count
        (n-1).downto(0) do |x|
            temp = arr[x]
            arr[x] = arr[0]
            arr[0] = temp

            heapify(arr, x-1, 0)
        end
        print arr
    end

    def build_heap(arr)
        start_index = arr.count/2 - 1
        (start_index).downto(0) do |x|
            heapify(arr, arr.count, x)
        end
   end

    def heapify(arr, n, i)
        largest = i 
        left = 2*i + 1
        right = 2*i + 2

        if (left < n && arr[left] > arr[largest]) 
            if arr[left] > arr[right]
                largest = left
            else
                largest = right
            end
        elsif right < n &&  arr[right] > arr[largest]
            largest = right
        else 
            largest = i
        end

        if largest != i 
            temp = arr[largest]
            arr[largest] = arr[i]
            arr[i] = temp
            heapify(arr, n, largest)
        end
    end
end

HeapSort.new.sort

kis platfrom pe kya dikh raha hai,
consult different platforms se create krna hai.
order summary
followup cards and payment
video consult
payment and coupon


image default placeholder,
click on coupon arrow,
loader,
payment button on remove/apply coupon

speciality name on top:

one of the following general physician will call you within 10 minutes.
